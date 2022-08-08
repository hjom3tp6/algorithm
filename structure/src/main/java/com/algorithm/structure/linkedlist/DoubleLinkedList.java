package com.algorithm.structure.linkedlist;

public class DoubleLinkedList {

    DoubleNode head = new DoubleNode(0, "head");

    public void addByOrder(DoubleNode node) {
        DoubleNode cur = head;
        boolean exist = false;
        while (cur.next != null) {

            if (cur.next.no > node.no) {
                break;
            }

            if (cur.next.no == node.no) {
                exist = true;
                break;
            }
            cur = cur.next;
        }

        if (exist) {
            cur.next.name = node.name;
            return;
        }

        if (cur.next != null) {
            node.next = cur.next;
            cur.next.pre = node;
        }

        cur.next = node;
        node.pre = cur;
    }

    public void listAll() {
        DoubleNode cur = head.next;
        while (cur != null) {
            System.out.println(cur.toString());
            cur = cur.next;
        }
    }

    public void listFromTail() {
        DoubleNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        while (cur.no > 0) {
            System.out.println(cur.toString());
            cur = cur.pre;
        }
    }

}