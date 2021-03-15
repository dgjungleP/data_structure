package com.jungle.ds.stack.demo;

/**
 * @version: v1.0
 * @date: 2021/3/15
 * @author: dgj
 */
public class SequentialStack implements Stack {

    private Node head;

    public SequentialStack() {
        this.head = new Node();
    }

    @Override
    public long pop() {
        if (empty()) {
            return -1;
        }
        Node result = this.head.next;
        this.head.next = result.next;
        return result.data;
    }

    @Override
    public void push(long data) {
        Node top = new Node(data);
        top.next = head.next;
        this.head.next = top;
    }

    @Override
    public boolean empty() {
        return this.head.next != null;
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
