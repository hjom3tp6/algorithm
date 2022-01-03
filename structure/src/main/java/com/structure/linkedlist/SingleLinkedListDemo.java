package com.structure.linkedlist;

public class SingleLinkedListDemo {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        Node node1 = new Node(1, "node1");
        Node node2 = new Node(2, "node2");
        Node node3 = new Node(3, "node3");
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.listAll();
    }
}

class SingleLinkedList {

    private Node head = new Node(0, "head");

    public void add(Node node) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void listAll() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.next.toString());
            temp = temp.next;
        }
    }
}

class Node {

    public int no;
    public String name;
    public Node next;

    public Node(int no, String name) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Node [no=" + no + ", name=" + name + "]";
    }
}
