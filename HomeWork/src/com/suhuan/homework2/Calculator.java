package com.suhuan.homework2;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 15:25
 */
public interface Calculator {

    double calculate(double n1, double n2);

}

class Cellphone {

    public static double testWork(Calculator calculator, double n1, double n2) {
        return calculator.calculate(n1, n2);
    }

}

class Test {
    public static void main(String[] args) {
        double result = Cellphone.testWork(new Calculator() {
            @Override
            public double calculate(double n1, double n2) {
                return n1 + n2;
            }
        }, 23, 34);
        System.out.println(result);
    }
}
