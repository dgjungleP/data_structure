package com.jungle.ds.linked.demo;

/**
 * @version: v1.0
 * @date: 2021/3/8
 * @author: dgj
 */
public class DoubledList implements Linked {
    private Node head;
    private int size;

    public DoubledList() {
        this.head = new Node();
        this.size = 0;
    }


    public void add(long data) {
        Node head = getTail();
        head.next = new Node(data);
        this.size++;
    }

    private Node getTail() {
        Node head = this.head;
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }

    public void add(int index, long data) {
        if (this.size < index) {
            Node tail = getTail().next;
            setNode(data, tail);
        } else {
            Node indexNode = getIndex(index);
            setNode(data, indexNode);
        }
        this.size++;
    }

    private void setNode(long data, Node tail) {
        Node node = new Node(data);
        node.pre = tail;
        tail.next = node;
    }

    public void remove(int index) {
        if (index > this.size) {
            return;
        }
        Node node = getIndex(index);
        Node next = node.next;
        node.pre.next = next;
        if (next != null) {
            next.pre = node.pre;
        }
        this.size--;
    }

    public void remove(long data) {
        if (this.size == 0) {
            return;
        }
        Node head = this.head;
        for (int i = 0; i < this.size; i++) {
            Node node = head.next;
            if (node.getData() == data) {
                remove(i);
                break;
            }
            head = node.next;
        }
    }

    public void set(int index, long data) {
        if (index > this.size) {
            return;
        }
        getIndex(index).setData(data);
    }

    public long get(int index) {
        if (index > this.size) {
            return -1;
        }
        Node head = getIndex(index);
        return head.data;
    }

    private Node getIndex(int index) {
        Node head = this.head;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return head;
    }

    public int getSize() {
        return size;
    }

    private static class Node {
        private long data;
        private Node next;
        private Node pre;

        public Node(long data, Node next, Node pre) {
            this.data = data;
            this.next = next;
            this.pre = pre;
        }

        public Node(long data) {
            this.data = data;
        }

        public Node() {
        }

        public long getData() {
            return data;
        }

        public void setData(long data) {
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
