package com.company;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(int data) {
        this.head = new Node(data);
    }

    private class Node {
        private int value;
        public Node next;


        public Node(int value) {
            this.value = value;
        }
    }

    public int size() {
        return this.numNodes;
    }

    public void add(int index, int value) {
        Node temp = this.head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(value);
        temp.next.next = holder;
        numNodes++;

    }
}

