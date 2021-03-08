package linked.demo;

/**
 * @version: v1.0
 * @date: 2021/3/8
 * @author: dgj
 */
public class DoubledList {
    private Node head;
    private int size;

    public DoubledList() {
        this.head = new Node();
        this.size = 0;
    }


    public void add(int data) {
        Node head = this.head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new Node(data);
        this.size++;
    }

    public int get(int index) {
        if (index > this.size) {
            return -1;
        }
        Node head = this.head;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return head.data;
    }

    public int getSize() {
        return size;
    }

    private class Node {
        private int data;
        private Node next;
        private Node pre;

        public Node(int data, Node next, Node pre) {
            this.data = data;
            this.next = next;
            this.pre = pre;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }
    }
}
