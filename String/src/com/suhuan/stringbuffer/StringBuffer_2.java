package com.suhuan.stringbuffer;

/**
 * @Auther: suhuan
 * @Date: 2022/9/26 - 09 - 26 - 19:33
 */
public class StringBuffer_2 {

    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer.length());//"null",长度为4
//        StringBuffer stringBuffer1 = new StringBuffer(str);//会抛出空指针异常

        String price = "121234567.45";
        StringBuffer sb = new StringBuffer(price);
        for (int i = sb.lastIndexOf("."); i > 3; i -= 3) {
            sb = sb.insert(i - 3, ",");
        }
        System.out.println(sb);
    }

}
