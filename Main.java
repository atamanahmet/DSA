
class MyLinkedList {

    class Node {
        int val;
        Node next;

        public Node(int x) {
            this.val = x;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        printList();

        int counter = 0;
        Node current = this.head;
        while (counter < this.size) {
            if (current != null) {
                System.out.println("current: " + current.val + " next: " + current.next);
            }

            if (counter == index) {
                return (current == null) ? -1 : current.val;
            } else {
                current = current.next;
                counter++;
            }
        }
        return -1;
    }

    public void addAtHead(int val) {
        printList();

        Node newNode = new Node(val);

        Node temp = this.head;
        newNode.next = temp;
        this.head = newNode;
        if (this.tail == null) {
            this.tail = newNode;
        }
        this.size++;
        printList();

    }

    public void addAtTail(int val) {
        System.out.println("Add at tail: " + this.tail.val + " Current List: ");
        printList();
        Node newNode = new Node(val);
        Node oldTail = this.tail;
        oldTail.next = newNode;
        this.tail = newNode;
        this.size++;
        printList();

    }

    public void addAtIndex(int index, int val) {
        System.out.println("Add at index val: " + val + " Current List: ");

        printList();

        int counter = 0;
        Node current = this.head;
        if (index == 0) {
            addAtHead(val);
        } else if (index == this.size) {
            addAtTail(val);
        } else {
            while (counter < size) {
                if (current == null) {
                    addAtTail(val);
                    break;
                }
                if (counter == index - 1) {
                    Node newNode = new Node(val);
                    Node after = current.next;
                    current.next = newNode;
                    newNode.next = after;
                    size++;
                    break;
                } else {
                    current = current.next;
                    counter++;
                }
            }
        }

        printList();

    }

    public void deleteAtIndex(int index) {
        System.out.println("delete index: " + index + " Current List: ");
        printList();

        if (index == 0) {
            this.head = this.head.next;
            return;
        }
        Node current = this.head;
        int counter = 0;
        while (counter < this.size) {
            if (counter == index - 1) {
                Node before = current;
                Node after = current.next.next;
                current.next.next = null;
                before.next = after;
                size--;
                break;
            } else {
                current = current.next;
                counter++;
            }
        }
        printList();

    }

    public void printList() {
        int counter = 0;
        Node curr = this.head;
        String str = "";
        while (counter < this.size) {
            if (curr == null) {
                break;
            }
            str += curr.val + "->";
            counter++;
            curr = curr.next;
        }
        System.out.println(str);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtIndex(1, 2);
        myLinkedList.get(1);
        myLinkedList.deleteAtIndex(0);
        // myLinkedList.get(0);

        // myLinkedList.addAtHead(7);
        // myLinkedList.addAtHead(2);
        // myLinkedList.addAtHead(1);
        // myLinkedList.addAtIndex(3, 0);
        // myLinkedList.deleteAtIndex(2);
        // myLinkedList.addAtHead(6);
        // myLinkedList.addAtTail(4);

        System.out.println(myLinkedList.get(0));

    }
}
