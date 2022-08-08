package com.algorithm.structure.linkedlist;

public class DoubleNode {

    public DoubleNode pre;
    public DoubleNode next;
    public String name;
    public int no;

    public DoubleNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "no= " + no + ", name= " + name;
    }
}

