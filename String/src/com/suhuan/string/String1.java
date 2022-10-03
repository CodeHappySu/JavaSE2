package com.suhuan.string;

/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 18:14
 */
@SuppressWarnings({"all"})
public class String1 {

    public static void main(String[] args) {
        //自动装箱就是将基本数据类型转换成对应的包装类
        //5之前
        //基本数据类型-->包装类
        int int1 = 10;
        Integer integer1 = new Integer(int1);
        Integer integer2 = Integer.valueOf(int1);
        //包装类-->基本数据类型
        int int2 = integer1.intValue();

        //5之后
        Integer i = 12;//其实底层还是用到了这个valueOf()方法

        int int3 = i;//底层还是用了i.intValue()方法

        //包装类和String之间的转换
        //Integer-->String
        Integer inter1 = 12;
        String str1 = inter1.toString();
        String str2 = int1 + "";
        String str3 = String.valueOf(inter1);
        //String-->Integer
        String str = "123";
        Integer integer = Integer.valueOf(str);
        Integer integer3 = Integer.parseInt(str);
        Integer integer4 = new Integer(str);
    }

}
