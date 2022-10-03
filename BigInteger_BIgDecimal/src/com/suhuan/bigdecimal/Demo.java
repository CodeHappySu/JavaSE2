package com.suhuan.bigdecimal;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: suhuan
 * @Date: 2022/9/27 - 09 - 27 - 19:48
 */
public class Demo {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1999.111111111111111111111999");
        System.out.println(bigDecimal);
        //加减乘一样的方法自己查
        //System.out.println(bigDecimal.divide(new BigDecimal("12.112154545")));//可能异常，Non-terminating decimal expansion
        //解决,保留分子的精度,调用者是分子
        System.out.println(bigDecimal.divide(new BigDecimal("12.112154545"),BigDecimal.ROUND_CEILING));
    }

}
class Test{
    public static void main(String[] args) throws ParseException {
        //第一代日期类
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(dateFormat.format(new Date()));
        //String-->Date
        String str = "2022年09月27日 08:39:12";
        Date parse = dateFormat.parse(str);
        System.out.println(dateFormat.format(parse));
        //第二代日期类
        Calendar cal = Calendar.getInstance();
        //里面的方法
        int year = cal.get(Calendar.YEAR);
        int month = cal.get((Calendar.MONTH) + 1);//0开始编号
        int day = cal.get((Calendar.DAY_OF_WEEK) + 1);
        int hour = cal.get((Calendar.HOUR) + 1);//12小时制
        int hours = cal.get((Calendar.HOUR_OF_DAY) + 1);//24小时制
        //第三代日期类
        //jdk1.8才加
        //1.LocalDate年月日
        //2.LocalTime时分秒
        //3.LocalDateTime年月日时分秒
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        int year1 = ldt.getYear();
        int monthValue1 = ldt.getMonthValue();//数
        Month mon = ldt.getMonth();//英文
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());
    }
}
class TEst{
    public static void main(String[] args) {
        //jdk1.8
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //对LocalDateTime进行格式化
        LocalDateTime now = LocalDateTime.now();
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        //时间戳
        Instant instant = Instant.now();
        Date date = Date.from(instant);
        System.out.println(date);
        Instant instant1 = date.toInstant();
        System.out.println(instant1);
        //还有很多...
    }
}
