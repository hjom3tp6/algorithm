package com.structure.linkedlist;

import org.junit.Before;
import org.junit.Test;

import com.algorithm.structure.linkedlist.DoubleLinkedList;
import com.algorithm.structure.linkedlist.DoubleNode;

public class DoubleLinkedListTest {

    DoubleLinkedList list = new DoubleLinkedList();

    @Before
    public void setUp() throws Exception {
        DoubleNode node1 = new DoubleNode(1, "node1");
        DoubleNode node2 = new DoubleNode(2, "node2");
        DoubleNode node3 = new DoubleNode(4, "node4");
        list.addByOrder(node1);
        list.addByOrder(node2);
        list.addByOrder(node3);
        list.listAll();
    }

    @Test
    public void addTest() {
        System.out.println("========addByOrder========");
        DoubleNode nodeInsert = new DoubleNode(3, "nodeInsert");
        list.addByOrder(nodeInsert);
        list.listAll();
        System.out.println("========listFromTail========");
        list.listFromTail();
    }
    
}