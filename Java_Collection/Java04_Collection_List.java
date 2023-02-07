package java_study.Java_Collection;

import java.util.LinkedList;

public class Java04_Collection_List {
    public static void main(String[] args) {
        // TODO - LinkedList - 链表
        LinkedList list = new LinkedList();

        //  1. 增加
        list.add("zhangsan");
        list.addFirst("lisi");
        list.add(1, "wangwu");
        list.addLast("zhaoliu");
        list.addAll(new LinkedList());

        //  2.获取数据
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        System.out.println(list.get(1));
        for (Object o : list) {
            System.out.println(o);
        }

        //  3.修改数据
        System.out.println(list.set(1,"zhaoliu"));

        //  4.删除数据
        System.out.println(list.remove("zhangsan"));
        System.out.println(list.remove());// 默认删除第一个
        list.removeFirst();
        list.remove(1);
        list.removeLast();
        list.clear();

        //  5.索引数据
        list.contains("zhangsan");
        list.indexOf(1);

        //  6.栈操作
        list.push("123"); // 加成第一个数
        list.pop(); // 弹出第一个数

    }
}
