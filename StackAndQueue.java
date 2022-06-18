package com.bridglabz;

public class StackAndQueue {
    Node head;
    Node tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void pop(){
        Node temp = head;
        Node secondLastNode = null;
        while (temp.next != null) {
            secondLastNode = temp;
            temp = temp.next;
        }
        secondLastNode.next = null;
        tail = secondLastNode;
        return;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
