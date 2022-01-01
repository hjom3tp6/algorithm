package com.structure;

public class QueueDemo {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.listQueue();
    }
}

class ArrayQueue {

    private int[] queue;
    private int maxSize;
    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize +1;
        this.queue = new int[maxSize];
        this.front = 0;
        this.rear = 0;
    }

    public void insert(int value) {
        if (this.isFull()) {
            System.out.println(" Is full !");
        } else {
            this.queue[this.rear] = value;
            this.rear = (this.rear + 1) % this.maxSize;
        }
    }

    public int get() {
        if (this.isEmpty()) {
            System.out.println(" Is empty !");
            return -1;
        }
        int value = this.queue[this.front];
        this.front = (this.front + 1) % this.maxSize;
        return value;
    }

    public boolean isFull() {
        return this.maxSize ==  (this.rear + 1) %  this.maxSize;
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public void listQueue() {
        for (int i : this.queue) {
            System.out.println(i);
        }
    }

}