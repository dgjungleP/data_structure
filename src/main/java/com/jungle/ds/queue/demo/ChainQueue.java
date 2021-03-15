package com.jungle.ds.queue.demo;

/**
 * @version: v1.0
 * @date: 2021/3/15
 * @author: dgj
 */
public class ChainQueue implements Queue {
    private Node head;

    @Override
    public boolean empty() {
        return head.next != null;
    }

    @Override
    public void enqueue(long data) {
        Node tail = getTail();
        tail.next = new Node(data);
    }

    private Node getTail() {
        Node tail = this.head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    @Override
    public long dequeue() {
        if (empty()) {
            return -1;
        }
        Node result = this.head.next;
        this.head.next = result.next;
        return result.data;
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
