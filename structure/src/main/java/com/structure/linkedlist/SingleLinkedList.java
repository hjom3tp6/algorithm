package com.structure.linkedlist;

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

    public void update(Node node) {
        Node temp = head;
        boolean exist = false;
        while (temp.next != null) {
            if (temp.next.no == node.no) {
                exist = true;
                break;
            }
            temp = temp.next;
        }
        if (exist) {
            temp.next.name = node.name;
        } else {
            System.out.println("Node no " + node.no + " not exist: ");
        }
    }

    public void delete(int no) {
        Node temp = head;
        boolean exist = false;
        while (temp.next != null) {
            if (temp.next.no == no) {
                exist = true;
                break;
            }
            temp = temp.next;
        }
        if (exist) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Node no " + no + " not exist: ");
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
