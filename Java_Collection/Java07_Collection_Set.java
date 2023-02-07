package java_study.Java_Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Java07_Collection_Set {
    public static void main(String[] args) {
        // TODO - Set
        //  Sort 排序
        //  hash：hash算法
        //  底层虽然是数组 + 链表 但是要通过hash算法 数据相同的时候 不会有重复
        HashSet set = new HashSet();
        // TODO 1.增加数据
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhangsan");
        // 2.修改数
        // 3.删除数据
        set.remove("wangwu");
        // 4.没有直接查询
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println(set);
        // 5.添加别的集合
        set.addAll(new ArrayList());
        // 6.集合变成数组
        Object[] objects = set.toArray();

        set.isEmpty();
        set.clear();
        set.contains("zhangsan");
        Object clone = set.clone();

    }
}


