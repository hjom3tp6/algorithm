package com.structure.recursion;

import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import com.algorithm.structure.recursion.Factorial;

public class FactorialTest {

    @Test
    public void calculateTest() {
        Factorial factorial = new Factorial();
        assumeTrue(factorial.calculate(1) == 1);
        assumeTrue(factorial.calculate(5) == 120);
    }

}
