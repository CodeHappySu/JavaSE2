package com.suhuan.wrapper;

/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 15:53
 */
@SuppressWarnings({"all"})
public class Integer02 {

    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(j == i);//i必然不能等于j因为都是new出来的
        Integer m = 1;//底层是Integer.valueOf(1);
        Integer n = 1;//底层是Integer.valueOf(1);
        //怎么写的呢？我们看源码
        /**
         IntegerCache.low = -128
         IntegerCache.high = 127
         public static Integer valueOf(int i) {
         if (i >= IntegerCache.low && i <= IntegerCache.high)[-128~127]
         return IntegerCache.cache[i + (-IntegerCache.low)];//直接返回类加载的时候初始化长度为256的数组中直接取得
         return new Integer(i);//直接new一个
         }
         */
        System.out.println(m == n);//true
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false

        Integer a = 127;
        int b = 127;
        System.out.println(a == b);
        a += 1;
        b += 1;
        System.out.println(a == b);
        Integer f = 128;
        int g = 128;
        System.out.println(f == g);
    }

}
