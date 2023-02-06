package java_study.Java_Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Java03_Collection_List {
    public static void main(String[] args) {
        // TODO 集合
        //  ArrayList 按照插入顺序进行和存储 内部就是数组
        //  1. 直接new 底层为空
        ArrayList arrayList = new ArrayList();
        // TODO
        //  2. 构造参数需要传递一个int类型的值，用于设定长度
        //  3. 构造参数传递一个Collection集合类型的值，用于将其他其他的数据放在当前集合中
        // TODO 打印全部集合对象
        System.out.println(arrayList); // []
        //  1.增加数据 如果底层没有任何数据，会默认创建长度为10的数组
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add(1, "赵六"); // 后续元素会后移
        arrayList.addAll(new ArrayList());
        System.out.println(arrayList);
        // 2.获取长度/判断是否为空
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        // 3.获取指定位置(index)
        System.out.println(arrayList.get(1));
        // 4.循环遍历
        for (Object o : arrayList) {
            System.out.println(o);
        }
        // 5.修改数据
        Object old = arrayList.set(1, "123");
        System.out.println(old);
        // 6.删除数据
        Object remove = arrayList.remove(1);
        System.out.println(remove);
        arrayList.clear();// 全不要
        arrayList.removeAll(new ArrayList());// 删除指定集合中的数据
        // 7.是否包含/第一个出现的位置的索引
        System.out.println(arrayList.contains("张三"));
        System.out.println(arrayList.indexOf("张三"));
        System.out.println(arrayList.lastIndexOf("张三"));
        // 8.集合变成数组
        Object[] objects = arrayList.toArray();
        Object clone = arrayList.clone();// 创建一个新的Collection
        ArrayList list = (ArrayList) clone; //强制转换
    }
}
