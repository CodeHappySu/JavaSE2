package com.suhuan.string2;

import javax.naming.Name;

/**
 * @Auther: suhuan
 * @Date: 2022/9/26 - 09 - 26 - 18:56
 */
public class StringMethod1 {

    public static void main(String[] args) {
        String s1 = "abc,def,ghi,jkl";
        String s2 = ",mno";
        //1.长度
        s1.length();
        //2.拼接
        System.out.println(s1.concat(s2));
        //3.分割
        String[] split = s1.split(",");
        int len = split.length;
        int i = 0;
        while (len -- != 0){
            System.out.println(split[i++]);
        }
        //4.字符数组转成字符串
        String s = String.valueOf(new char[]{'a', 'c', 'd'});
        System.out.println(s);
        //5.String-->Integer
        Integer i1 = s1.indexOf(123);
        Integer.parseInt("123");
        //6.比较，返回值是调用者和参数的长度之差
        int i2 = s2.compareTo(s1);
        System.out.println(i2);
        //7.截取
        String substring = s1.substring(2, 5);//5-2为3，从2开始数三个
        System.out.println(substring);
        //8.通过下标获取值
        char c = s1.charAt(3);
        System.out.println(c);
        //9.字符串变字符数组
        char[] chars = s1.toCharArray();
        //10.忽略大小写比较
        s1.equalsIgnoreCase("AF");
        //11.格式化
        String name = "Tom";
        int age = 23;
        double score = 93.5;
        char gender = '男';
        String formatStr = "我叫%s，年龄是%d，成绩是%.2f，性别是%c。";
        String format = String.format(formatStr, name, age, score, gender);
        System.out.println(format);
        //...自己查api
    }

}
