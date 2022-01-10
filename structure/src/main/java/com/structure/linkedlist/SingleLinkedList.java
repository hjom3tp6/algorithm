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

    public int length() {
        Node temp = head;
        int i = 0;
        while (temp.next != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public Node findLastIndexNode(int i) {
        Node temp = head;
        int length = this.length();
        int target = length - i + 1;
        int cur = 1;
        if (length == 0) {
            throw new Error("length = 0");
        }

        if (target < 1 || i <= 0) {
            throw new Error("Node not exist");
        }

        while (temp.next != null) {
            temp = temp.next;
            if (cur == target) {
                break;
            }
            cur++;
        }

        return temp;

    }

    public void reverse() {
        if(head.next == null) {
            System.out.println("is empty");
            return;
        }
        Node reverseHead = new Node(0, "reverseHead");
        Node temp = head.next;
        Node next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = reverseHead.next;
            reverseHead.next = temp;
            temp = next;
        }
        head.next = reverseHead.next;
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
