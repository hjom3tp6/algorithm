package com.structure.stack;

import org.junit.Test;

import com.algorithm.structure.stack.ArrayStack;

public class ArrayStackTest {
    @Test
    public void pushTest() {
        ArrayStack stack = new ArrayStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();
        stack.push(5);
    }

    @Test
    public void popTest() {
        ArrayStack stack = new ArrayStack(4);
        stack.push(1);
        stack.push(2);
        stack.print();
        System.out.println("pop " + stack.pop());
        stack.print();
        System.out.println("pop " + stack.pop());
        stack.print();
    }
}
