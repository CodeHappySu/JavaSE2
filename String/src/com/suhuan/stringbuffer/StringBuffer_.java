package com.suhuan.stringbuffer;

/**
 * @Auther: suhuan
 * @Date: 2022/9/26 - 09 - 26 - 19:33
 */
public class StringBuffer_ {

    public static void main(String[] args) {
        //StringBuffer的四种构造器
        //1.无参构造器:会调用父类的有参构造器将16传给父类然后创建一个char类型的数组让父类的value指向该数组，完成初始化
        StringBuffer sb = new StringBuffer();
        //2.有参构造器：父类直接创建一个长度为100的char类型数组，让value指向该数组
        StringBuffer sbb = new StringBuffer(100);
        //还有两个自己看源码
        /**public StringBuilder(String str) {
            super(str.length() + 16);//父类创建长度+16的数组，然后将sbbb
            append(str);
        }*/
        StringBuilder sbbb = new StringBuilder("abc");
    }

}
