package java_study.Java_Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Java11_Collection_Map {
    public static void main(String[] args) throws Exception {
        // TODO - Map - hashtable
        Hashtable table = new Hashtable();
        // TODO
        //  区别：1.父类不一样
        //  区别：2.底层容量不同（hashmap：16，hashtable：11）
        //  区别：3.HashMap的K，V都可以是null Hashtable不行
        //  区别：4.HashMap的数据定位采用的是Hash算法，Hashtable只是hashcode
        //  区别：5.HashMap的性能较高，但多线程选Hashtable

    }
}
