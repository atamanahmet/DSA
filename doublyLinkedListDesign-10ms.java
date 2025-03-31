
class MyLinkedList {
    class Node {
        Object val; //for preventing box-unbox
        Node next;
        Node prev;

        public Node(int x) {
            this.val = x;
            this.next = null;
            this.prev = null;
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
        if (index < 0 || index >= this.size || this.size == 0)
            return -1;
        if (index == 0)
            return (int) this.head.val;
        Node curr = this.head;
        for (int i = 0; i <= index; i++) {
            if (curr == null)
                return -1;
            if (i == index)
                return (int) curr.val;
            else
                curr = curr.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node curr = this.head;
        Node newNode = new Node(val);
        if (curr != null) {
            curr.prev = newNode;
        }
        newNode.next = curr;
        this.head = newNode;
        if (this.tail == null) {
            this.tail = newNode;
        }
        size++;

    }

    public void addAtTail(int val) {
        if (size == 0)
            addAtHead(val);
        else {
            Node newNode = new Node(val);
            Node curr = this.head;
            for (int i = 0; i < this.size; i++) {
                if (i == this.size - 1) {
                    newNode.next = curr.next;
                    newNode.prev = curr;
                    curr.next = newNode;
                    this.tail = newNode;
                    size++;
                    return;
                } else {
                    curr = curr.next;
                }
            }
        }

    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size)
            return;
        else if (index == 0)
            addAtHead(val);
        else if (index == size)
            addAtTail(val);
        else {
            Node curr = this.head;
            for (int i = 0; i <= index; i++) {
                if (i == index - 1) {
                    Node newNode = new Node(val);
                    Node before = curr;
                    Node after = curr.next;
                    before.next = newNode;
                    after.prev = newNode;
                    newNode.prev = before;
                    newNode.next = after;
                    size++;
                    return;
                } else {
                    curr = curr.next;
                }
            }
        }

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size || this.size == 0 || this.head == null || this.tail == null)
            return;

        if (index == 0) {
            if (this.size == 1) {
                this.head = null;
                this.tail = null;
                size--;
                return;
            }
            this.head = this.head.next;
            this.head.prev = null;
            size--;
            return;
        }

        Node curr = this.head;
        for (int i = 0; i <= index; i++) {
            if (i == index - 1) {
                Node before = curr;
                Node after = curr.next.next;
                before.next = after;
                if (after == null) {
                    this.tail = before;
                } else {
                    after.prev = before;
                }
                size--;
                return;
            } else {
                curr = curr.next;
            }
        }

    }
    // Debug
    // public void print(){
    // int c = 0;
    // Node curr = this.head;
    // String str = "";
    // while (c < this.size) {
    // if (curr == null) {
    // break;
    // }
    // str += curr.val + "->";
    // c++;
    // curr = curr.next;
    // }
    // System.out.println(str);
    // }
}
