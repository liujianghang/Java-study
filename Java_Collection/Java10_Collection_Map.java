package java_study.Java_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class Java10_Collection_Map {
    public static void main(String[] args) throws Exception {
        // TODO - Map - 实现的是Map接口
        //  HashMap 数组+单向链表（无序）
        //  根据key来决定是否相同
        //  如果是相同的key 会覆盖
        HashMap<String, String> map = new HashMap<>();

        // TODO put(增加，修改数据，返回值是修改前的值)
        map.put("zhangsan", "1");
        map.put("lisi", "2");
        System.out.println(map.put("wangwu", "3")); // null
        // 覆盖了
        System.out.println(map.put("zhangsan", "4"));

        // TODO get
        System.out.println(map.get("zhangsan"));

        // TODO remove
        System.out.println(map.remove("zhangsan"));
        // TODO remove 只删除特定键值对,否则不删
        System.out.println(map.remove("zhangsan", "1"));

        // TODO putIfAbsent 如果没有这个key才添加 不然不做
        map.putIfAbsent("b", "2");
        map.putIfAbsent("b", "3");

        // TODO replace 找到key然后修改value 如果没有返回null
        System.out.println(map.replace("b", "4"));

        // TODO keySet 获取所有的key
        Set set = map.keySet();
        System.out.println(set);
        // TODO 获取所有的value
        for (Object o : set) {
            System.out.println(map.get(o));
        }
        // TODO 获取所有的value
        System.out.println(map.values());

        // TODO contains
        System.out.println(map.containsKey("zhangsan"));
        System.out.println(map.containsValue("1"));

        // TODO 获取键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            //lisi=2
            //b=4
            //wangwu=3
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
