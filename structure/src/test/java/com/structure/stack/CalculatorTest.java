package com.structure.stack;

import org.junit.Assert;
import org.junit.Test;

import com.algorithm.structure.stack.Calculator;

public class CalculatorTest {

    @Test
    public void calTest(){
        String expression = "3+2*5-6";

        Calculator calculator = new Calculator();
        calculator.scan(expression);
        int res = calculator.nextCal();
        System.out.printf("%s = %d \n", expression, res);
        Assert.assertEquals(res, 7);
    }
    
}
