package com.algorithm.structure.linkedlist;

public class Node {

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
