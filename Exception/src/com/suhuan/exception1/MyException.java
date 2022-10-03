package com.suhuan.exception1;

/**
 * @Auther: suhuan
 * @Date: 2022/9/25 - 09 - 25 - 14:53
 */
public class MyException extends RuntimeException {

    public MyException(){//无参构造器

    }

    public MyException(String message){//有参构造器
        super(message);
    }

    /**
     *
     * @param message 产生异常的信息
     * @param cause 产生异常的原因
     */
    public MyException(String message,Throwable cause){//
        super(message,cause);
    }

    /**
     *
     * @param cause 产生异常的原因
     */
    public MyException(Throwable cause){
        super(cause);
    }

}

class ExceptionTest{
    public void m1() throws MyException{
        throw new MyException("m1方法抛出异常");
    }

    public void m2(){
        try {
            m1();
        }catch (MyException e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        ExceptionTest e = new ExceptionTest();
        e.m2();
    }
}
