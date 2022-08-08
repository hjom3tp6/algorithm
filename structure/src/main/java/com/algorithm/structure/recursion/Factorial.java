package com.algorithm.structure.recursion;

public class Factorial {
    public static void main(String[] args) {
        
    }

    public int calculate(int i) {
        if (i == 1) {
            return i;
        }
        return i * calculate(i - 1);
    }

}
