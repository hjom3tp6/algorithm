package com.structure.linkedlist;

public class CircleLinkedList {
  Boy first = null;

  public void add(int num) {
    Boy cur = null;
    if (num < 1) {
      System.out.println("num < 1");
      return;
    }
    for (int i = 1; i <= num; i++) {
      Boy boy = new Boy(i);
      if (first == null) {
        first = boy;
        boy.next = first;
        cur = first;
        continue;
      }
      cur.next = boy;
      boy.next = first;
      cur = boy;
    }
  }

  public void print() {
    if (first == null) {
      System.out.println("队列为空");
      return;
    }
    Boy cur = first;

    do {
      System.out.println("cur.no => " + cur.no);
      cur = cur.next;
    } while (cur != first);
  }

  public void countBoy(int startNo, int countNum, int num) {
    if (first == null || countNum < 1 || startNo > num) {
      System.out.println("error parameter");
      return;
    }
    Boy helper = first;
    while (helper.next != first) {
      helper = helper.next;
    }

    for (int i = 1 ; i < startNo  ; i ++) {
      helper = first;
      first = first.next;
    }

    System.out.printf("From hear： %d \n", startNo);
    print();

    while(true){
      if (helper == first){
        System.out.printf("final boy %d \n", first.no);
        break;
      }
      for (int i = 1 ; i < countNum ; i ++){
        helper = first;
        first = first.next;
      }

      System.out.println("boy no." + first.no + " out");
      first = first.next;
      helper.next = first;
    }


  }
}

class Boy {
  int no;
  Boy next;

  public Boy(int num) {
    this.no = num;
  }
}
