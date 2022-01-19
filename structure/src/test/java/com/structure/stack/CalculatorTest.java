package com.structure.stack;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calTest(){
        String expression = "3+2*5-6";

        Calculator calculator = new Calculator();
        // 扫描表达式
        calculator.scan(expression);
        // 剩余数据进行计算
        int res = calculator.nextCal();
        System.out.printf("%s = %d \n", expression, res);
        Assert.assertEquals(res, 7);
    }
    
}
