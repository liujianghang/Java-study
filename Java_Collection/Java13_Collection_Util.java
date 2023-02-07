package java_study.Java_Collection;

import java.util.*;

public class Java13_Collection_Util {
    public static void main(String[] args) throws Exception {
        // TODO - 集合 - Util
        int[] is = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(is)); // [1, 2, 3, 4, 5]
        System.out.println(is); // [I@4f3f5b24

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers); // [1, 2, 3, 4, 5]

        // TODO 排列
        Arrays.sort(is);

        // TODO 二分查找 针对 排序后的数组
        int i = Arrays.binarySearch(is, 5);

        // TODO 数组的比较 顺序也要一样 也可以只比较部分
        int[] is1 = {1,2,3,4,6};
        System.out.println(Arrays.equals(is,is1)); //false
        System.out.println(Arrays.equals(is,0,4,is1,0,4)); //true


    }
}
