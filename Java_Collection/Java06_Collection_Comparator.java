package java_study.Java_Collection;

import java.util.ArrayList;
import java.util.Comparator;

public class Java06_Collection_Comparator {
    public static void main(String[] args) {
        // TODO - LinkedList - 比较器
        //  Sort 排序
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        // TODO 排序需要传一个实现了比较器接口的对象 注意是两两比较
        list.sort(new NumberComparator());
        System.out.println(list);
    }
}

class NumberComparator implements Comparator<Integer> {

    // TODO 看return的结果 正数就是升序 负数就是降序
    //  第一个比第二个大 升序
    //  第一个比第二个小 降序
    //  一样大 返回0
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

