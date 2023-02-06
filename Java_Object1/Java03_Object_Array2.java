package java_study.Java_Object1;

public class Java03_Object_Array2 {
    public static void main(String[] args) {
        // TODO 常见类和对象：二维数组
        int[] nums = new int[3];
        for (int num : nums) {
            System.out.println(num);
        }
        String[] names = {"zhangsan", "lisi", "wangwu"};
        String[][] names2 = {{"zhangsan", "lisi", "wangwu"}, {"lisi", "wangwu"}, {}};

        // 标准二维数组
        String[][] strings = new String[3][3];
    }
}

