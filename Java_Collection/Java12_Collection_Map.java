package java_study.Java_Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Java12_Collection_Map {
    public static void main(String[] args) throws Exception {
        // TODO - Map - 迭代器
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        Set<String> keys = map.keySet();
//        for (String key : keys) { //ConcurrentModificationException
        // 因为在对集合进行处理的过程中对集合进行了修改导致的 keys不知道删掉了键值对
//            if ("b".equals(key)) {
//                map.remove("b");
//            }
//        }
        // 对与map的增加和删除应该使用迭代器
        // TODO 迭代器 - 专门用来迭代数据的
        Iterator<String> iterator = keys.iterator();
        // TODO hasNext() 用于判断是否存在下一条数据
        while (iterator.hasNext()){
            String key = iterator.next();
            if ("b".equals(key)){
                // remove只能对当前数据删除
                iterator.remove(); // 1 null 3
            }
            System.out.println(map.get(key));
        }

    }
}
