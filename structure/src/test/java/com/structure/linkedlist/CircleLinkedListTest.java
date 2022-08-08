package com.structure.linkedlist;

import org.junit.Test;

import com.algorithm.structure.linkedlist.CircleLinkedList;

public class CircleLinkedListTest {

  @Test
  public void addTest() {

    CircleLinkedList circleLinkedList = new CircleLinkedList();
    circleLinkedList.add(5);
    circleLinkedList.print();
  }

  @Test
  public void countBoyTest() {
    CircleLinkedList circleLinkedList = new CircleLinkedList();
    circleLinkedList.add(5);
    circleLinkedList.countBoy(1, 2, 5);
  }
}
