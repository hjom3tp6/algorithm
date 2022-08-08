package com.algorithm.structure.stack;

public class ArrayStack {

    private int[] stack;
    private int top = -1;
    private int maxSize;

    public ArrayStack(int num) {
        stack = new int[num];
        maxSize = num;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("isFull");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        }
        return stack[top--];
    }

    public void print() {
        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("index: %d, value = %d \n", i, stack[i]);
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("isEmpty");
        }
        return stack[top];
    }

}
