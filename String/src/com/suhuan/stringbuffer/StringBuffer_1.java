package com.suhuan.stringbuffer;

/**
 * @Auther: suhuan
 * @Date: 2022/9/26 - 09 - 26 - 19:33
 */
public class StringBuffer_1 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.append("haha");
        sb.append("nihao");
        System.out.println(sb.toString());
        sb.delete(2,5);//删除[2,5)即剩下hehahanihao
        System.out.println(sb);
        sb.replace(1,3,"替换了");//[1,3)
        System.out.println(sb);//h替换了ahanihao
        int index = sb.indexOf("hao");
        System.out.println(index);
        //插
        StringBuffer insert = sb.insert(2, "123");
        System.out.println(insert);
        System.out.println(sb);//结果一样的
        //长度
        int length = sb.length();
        System.out.println(length);
    }

}
