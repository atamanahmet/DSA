class MyStack {
    Node tail = new Node(Integer.MIN_VALUE);
    int size;

    class Node {
        int val;
        Node prev;

        Node(int val) {
            this.val = val;
            this.prev = null;
        }
    }

    public MyStack() {
        this.size = 0;
        this.tail = new Node(Integer.MIN_VALUE);
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if (this.size > 0) {
            Node oneBefore = this.tail.prev;
            newNode.prev = oneBefore;
        }
        this.tail.prev = newNode;
        size++;
    }

    public int pop() {
        Node removed = this.tail.prev;
        if (removed != null) {
            int poped = removed.val;
            this.tail.prev = removed.prev;
            size--;
            return poped;
        }
        return 0;
    }

    public int top() {
        return (this.tail.prev != null) ? this.tail.prev.val : 0;
    }

    public boolean empty() {
        return (this.tail.prev != null) ? false : true;
    }
}
