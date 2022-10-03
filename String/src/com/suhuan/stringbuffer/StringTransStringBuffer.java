package com.suhuan.stringbuffer;

/**
 * @Auther: suhuan
 * @Date: 2022/9/26 - 09 - 26 - 20:17
 */
public class StringTransStringBuffer {

    public static void main(String[] args) {
        //String-->StringBuffer
        String str = "hello";
        //无非两种方式
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer sb = new StringBuffer();
        StringBuffer append = sb.append(str);

        //StringBuffer-->String
        String s = sb.toString();
        String s1 = new String(stringBuffer);
    }

}
