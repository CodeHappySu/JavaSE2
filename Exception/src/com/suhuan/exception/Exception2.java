package com.suhuan.exception;

/**
 * @Auther: suhuan
 * @Date: 2022/9/24 - 09 - 24 - 21:23
 */
public class Exception2 {

    public static void main(String[] args)
    {
        Exception2 test = new Exception2();
        System.out.println(test.fun());//HelloWordFinally
        //为啥return的值可以改变
        //return语句先将返回值写入内存中，然后停下来等待finally语句执行完，return再执行后面的一段
    }

    public StringBuilder fun()
    {
        StringBuilder s = new StringBuilder("Hello");
        try
        {
            //doing something
            s.append("Word");

            return s;
        }catch(Exception e){
            return s;
        }finally{
            s.append("Finally");
        }
    }

}
