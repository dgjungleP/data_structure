package com.jungle.ds.linked.demo;

/**
 * @version: v1.0
 * @date: 2021/3/10
 * @author: dgj
 * 基础版。后期分析并优化将时间复杂度降低为O(1)
 */
public class LRUEliminationAlg {
    private Integer capacity;
    private Node head;
    private Integer size;

    public LRUEliminationAlg(Integer capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new Node();
    }

    public void put(String key, Integer value) {
        if (size >= capacity) {
            clean();
        }
        Node node = checkKey(key);
        if (node != null) {
            node.data = value;
            deleteNode(node);
            insertHead(node);
        } else {
            Node newNode = new Node(key, value);
            insertHead(newNode);
        }
        this.size++;
    }

    private void insertHead(Node node) {
        node.pre = head;
        Node next = head.next;
        if (next != null) {
            next.pre = node;
        }
        node.next = next;
        head.next = node;
    }

    private Node getTail() {
        Node head = this.head.next;
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }

    private void deleteNode(Node node) {
        Node next = node.next;
        Node pre = node.pre;
        if (next != null) {
            next.pre = pre;
        }
        pre.next = next;
        this.size--;
    }

    private Node checkKey(String key) {
        Node head = this.head.next;
        while (head != null) {
            if (head.key.equals(key)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    private void clean() {
        Node tail = getTail();
        deleteNode(tail);
    }

    public Integer get(String key) {
        if (size == 0) {
            return -1;
        }
        Node node = checkKey(key);
        if (node != null) {
            return node.data;
        }
        return -1;
    }

    public static class Node {
        private String key;
        private Integer data;
        private Node pre;
        private Node next;

        public Node(String key, Integer data) {
            this.key = key;
            this.data = data;
        }

        public Node() {
        }

    }
}
