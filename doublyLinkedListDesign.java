import java.util.HashMap;

class MyLinkedList {
    public static void main(String[] args) {

    }

    public MyLinkedList() {
        Integer head = null;
        Integer tail = null;
        int index = 0;
        HashMap<Integer, Integer> nextMap = new HashMap<>();
    }

    public int get(int index) {

    }

    public void addAtHead(int val, Integer head, Integer tail) {
        if (head == null && tail == null) { // first node
            head = val;
            tail = val;
            next = null;
            map.put(val, next);
        } else {
            int temp = head;
            head = val;
            next = temp;
            map.put(val, next);
        }
    }

    public void addAtTail(int val) {
        if (tail == null && head == null) { // first node
            tail = val;
            head = val;
            next = null;
        } else {
            int temp = tail;
            tail = val;
            next = temp;
        }
    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

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