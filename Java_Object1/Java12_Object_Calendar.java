package java_study.Java_Object1;

import java.util.Calendar;
import java.util.Date;

public class Java12_Object_Calendar {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  日历类
        //  Calendar： 日历类 是一个抽象的类 无法直接获取对象
        Calendar instance = Calendar.getInstance();
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DATE);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);

        instance.setTime(new Date());
        instance.add(Calendar.YEAR, 1);
        System.out.println(instance.getTime()); //Fri Feb 02 21:15:41 HKT 2024


    }
}
