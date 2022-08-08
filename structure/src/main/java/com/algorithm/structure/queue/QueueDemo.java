package com.algorithm.structure.queue;

public class QueueDemo {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.listQueue();
        queue.get();
        queue.get();
        queue.insert(5);
        queue.insert(6);
        queue.listQueue();
    }
}

class ArrayQueue {

    private int[] arr;
    private int arrSize;
    private int front;
    private int rear;

    public ArrayQueue(int queueSize) {
        arrSize = queueSize + 1;
        arr = new int[arrSize];
        front = 0;
        rear = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println(" Is full !");
        } else {
            arr[rear] = value;
            rear = (rear + 1) % arrSize;
        }
    }

    public int get() {
        if (isEmpty()) {
            throw new RuntimeException("Is empty !");
        }
        int value = arr[front];
        front = (front + 1) % arrSize;
        return value;
    }

    public boolean isFull() {
        return front == (rear + 1) % arrSize;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void listQueue() {
        if (isEmpty()) {
            System.out.println("Is empty !");
        } else {
            for (int i = front; i < front + size(); i++) {
                System.out.print(arr[i % arrSize] + " ");
            }
            System.out.println();
        }
    }

    public int size() {
        return (rear - front + arrSize) % arrSize;
    }

}