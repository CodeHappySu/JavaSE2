package com.suhuan.exception1;

/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 14:42
 */
public class ExceptionTest_ {

    public void divide(int n1, int n2) throws Exception {//这是一个编译时异常
        if (n2 == 0)
            throw new Exception("分母不能为0！");//抛调用者
        else
            System.out.println(n1 / n2);
    }

}

class Test {
    public static void main(String[] args) {
        ExceptionTest_ e = new ExceptionTest_();
        //处理方式1：
        try {
            e.divide(5, 0);//由于这是一个编译时异常所以要进行处理
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Test1 {
    public static void main(String[] args) throws Exception {//处理方式2：
        ExceptionTest_ e = new ExceptionTest_();
        e.divide(3, 0);
    }
}
