package java_study.Java_Object1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java11_Object_Date {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  日期类
        // Date: 日期类
        // 时间戳: 毫秒
        System.out.println(System.currentTimeMillis()); //1675343095884

        // Calendar : 日历类
        Date date = new Date();
        System.out.println(date); // Thu Feb 02 21:04:55 HKT 2023

        // Java日期格式化
        // y -> yyyy
        // m -> MM(月份) mm(分钟)
        // d -> D(一年中的日期) d(一个月当中的日期)
        // h -> h(12进制) H(24进制)
        // s -> s(秒) S(毫秒)
        // 2023-02-02 21:04:55:884
        // TODO Date -> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format = sdf.format(date);
        System.out.println(format);

        // TODO String -> Date
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2023-04-03";
        Date parseDate = sdf1.parse(dateString);
        // Mon Apr 03 00:00:00 HKT 2023
        System.out.println(parseDate);

        // TODO 根据时间戳获得指定的日期对象
        // date.setTime();
        // 获取时间戳
        // date.getTime();
        // TODO 判断是否早于这个时间戳
        //  false
        System.out.println(parseDate.before(date));
        System.out.println(parseDate.after(date));
    }
}
