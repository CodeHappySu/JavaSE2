package com.suhuan.biginteger;

import java.math.BigInteger;

/**
 * @Auther: suhuan
 * @Date: 2022/9/27 - 09 - 27 - 19:54
 */
public class Demo {

    public static void main(String[] args) {
        BigInteger bi = new BigInteger("999999999999999999999");
        BigInteger b = new BigInteger("1");
        System.out.println(bi);
        //+-*/不能直接加减乘除运算
        //加
        BigInteger add = bi.add(b).add(BigInteger.valueOf(1234567L));
        System.out.println(add);//1000000000000001234567
        //减
        BigInteger sub = add.subtract(new BigInteger("1234567"));//1000000000000000000000
        System.out.println(sub);
        //乘
        BigInteger mul= sub.multiply(new BigInteger("9"));//9000000000000000000000
        System.out.println(mul);
        //除
        BigInteger divide = mul.divide(new BigInteger("9"));//1000000000000000000000
        System.out.println(divide);

    }

}
