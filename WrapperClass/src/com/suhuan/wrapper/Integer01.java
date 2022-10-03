package com.suhuan.wrapper;

/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 15:53
 */
@SuppressWarnings({"all"})
public class Integer01 {

    public static void main(String[] args) {
        //int<-->Integer的装箱和拆箱
        //jdk1.5之前，是手动挡
        //int-->Integer
        int n1 = 10;
        Integer integer1 = new Integer(n1);
        Integer integer3 = Integer.valueOf(13);
        //Integer-->int
        int i1 = integer1.intValue();

        //jdk1.5之后就自动挡了
        int n2 = 33;
        //int-->Integer
        Integer inter1 = 13;
        Integer inter2 = n2;//底层使用的仍然是Integer.valueOf(n2)这个方法
        //Integer-->int
        int int1 = inter1;
        int int2 = inter2;//底层用的inter2.intValue()
        //总结：就是进行包装了一下，其他的包装数据类型都是类似的，不一一展示
    }

}
