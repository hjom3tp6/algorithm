package com.algorithm.structure.stack;

public class Calculator {

    private ArrayStack numStack = new ArrayStack(10);
    private ArrayStack operStack = new ArrayStack(10);

    public void scan(String expression) {
        int index = 0;
        while (true) {
            if (index == expression.length()) {
                break;
            }
            char ch = expression.substring(index, ++index).charAt(0);
            if (isOper(ch)) {
                if (operStack.isEmpty()) {
                    operStack.push(ch);
                    continue;
                }
                if (priority(ch) > priority((char) operStack.peek())) {
                    operStack.push(ch);
                    continue;
                }
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                int oper = operStack.pop();
                int res = cal(num1, num2, oper);
                numStack.push(res);
                operStack.push(ch);
            } else {
                numStack.push(ch - 48);
            }
        }
    }

    public int nextCal() {
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            int num1 = numStack.pop();
            int num2 = numStack.pop();
            int oper = operStack.pop();
            int res = cal(num1, num2, oper);
            numStack.push(res);
        }
        return numStack.pop();
    }

    private boolean isOper(char ch) {
        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    private int cal(int num1, int num2, int oper) {
        switch (oper) {
            case '+':
                return num2 + num1;
            case '-':
                return num2 - num1;
            case '*':
                return num2 * num1;
            case '/':
                return num2 / num1;
        }
        return 0;
    }

    private int priority(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            default:
                return -1;
        }
    }
}
