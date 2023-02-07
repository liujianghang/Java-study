package java_study.Java_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Java14_Collection_Exception {
    public static void main(String[] args) throws Exception {
        // TODO - 集合 - Exception
//        ArrayList list = new ArrayList(-1); // IllegalArgumentException
        ArrayList list = new ArrayList(10);
        list.add("a");
        list.add("b");
        list.add("c");
        // TODO List类的索引范围是数据的长度-1 这和数组不一样
//        System.out.println(list.get(4)); //IndexOutOfBoundsException

        LinkedList list1 = new LinkedList();
//        System.out.println(list1.getFirst()); // NoSuchElementException


    }
}
