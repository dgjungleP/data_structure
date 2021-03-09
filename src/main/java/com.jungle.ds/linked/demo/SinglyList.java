package com.jungle.ds.linked.demo;

/**
 * @version: v1.0
 * @date: 2021/3/8
 * @author: dgj
 */
public class SinglyList implements Linked {
    private Node head;
    private int size;

    public SinglyList() {
        this.head = new Node();
        this.size = 0;
    }


    @Override
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

    @Override
    public void add(int index, long data) {
        if (index > this.size) {
            getTail().next = new Node(data);
        } else {
            Node node = getIndex(index);
            Node next = node.next;
            node.next = new Node(data);
            node.next.next = next;
        }
        this.size++;
    }

    @Override
    public void remove(int index) {
        if (index > this.size) {
            return;
        }
        Node node = getIndex(index - 1);
        node.next = node.next.next;
        this.size--;
    }

    @Override
    public void remove(long data) {
        if (this.size == 0) {
            return;
        }
        Node head = this.head;
        for (int i = 0; i < this.size; i++) {
            Node next = head.next;
            if (next.getData() == data) {
                remove(i);
                break;
            }
            head = next;
        }
    }

    @Override
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

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
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
    }
}
