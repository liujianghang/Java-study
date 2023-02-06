package java_study.Java_Object1;

public class Java10_Object_DataType {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  基本数据类型 不继承Object
        // byte short int long float double char boolean
        // TODO 包装类 这样基本数据类型就有了对象的感觉
//        Integer i = null;
//        Character c = null;
//        Double d = null;
        int i = 10;
        // TODO 基本数据类型转为了包装类类型
        Integer i1 = Integer.valueOf(i);
        // TODO 等于下面这句(自动装箱)
        Integer l1 = i;
        // TODO 拆箱
        int i2 = l1.intValue();
        // TODO 等于下面这句(自动拆箱)
        int i3 = l1;
    }
}
