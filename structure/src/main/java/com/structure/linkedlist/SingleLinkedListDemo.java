package com.structure.linkedlist;

public class SingleLinkedListDemo {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        Node node1 = new Node(1, "node1");
        Node node2 = new Node(2, "node2");
        Node node3 = new Node(3, "node3");
        Node nodeInsert = new Node(2, "nodeInsert");
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.addByOrder(nodeInsert);
        list.listAll();
        // Node [no=1, name=node1]
        // Node [no=2, name=nodeInsert]
        // Node [no=3, name=node3]
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

    public void addByOrder(Node node) {
        Node temp = head;
        boolean exist = false;
        while (temp.next != null) {
            if (temp.next.no > node.no) {
                break;
            }
            if (temp.next.no == node.no) {
                exist = true;
                break;
            }
            temp = temp.next;
        }
        if (exist) {
            temp.next.name = node.name;
        } else {
            node.next = temp.next;
            temp.next = node;
        }
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
