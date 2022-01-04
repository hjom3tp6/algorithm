package com.structure.linkedlist;

import org.junit.Before;
import org.junit.Test;

public class SingleLinkedListTest {

    SingleLinkedList list = new SingleLinkedList();

    @Before
    public void setUp() throws Exception {
        Node node1 = new Node(1, "node1");
        Node node2 = new Node(2, "node2");
        Node node3 = new Node(3, "node3");
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.listAll();
    }

    @Test
    public void addByOrderTest() {
        System.out.println("========addByOrder========");
        Node nodeInsert = new Node(2, "nodeInsert");
        list.addByOrder(nodeInsert);
        list.listAll();
    }

    @Test
    public void updateTest() {
        System.out.println("========update========");
        Node nodeupdate = new Node(4, "nodeupdate");
        list.update(nodeupdate);
        list.listAll();
    }

    
    @Test
    public void deleteTest() {
        System.out.println("========delete========");
        list.delete(1);
        list.listAll();
    }
}
