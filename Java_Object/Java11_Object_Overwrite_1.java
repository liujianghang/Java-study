package java_study.Java_Object;

public class Java11_Object_Overwrite_1 {
    public static void main(String[] args) {
        // TODO 面向对象 - 重写
        //  !!! 一个对象能使用什么属性和方法，取决于引用的类
        //  一个对象的方法具体的使用是需要看具体的对象的
        //  一个对象的属性具体的使用是不需要看具体的对象的，属性在哪声明在哪里使用
        //  !!! 但是具体使用了什么 取决于具体的对象（new）
        CCC ddd = new DDD();
        System.out.println(ddd.sum()); // 结果是30
    }
}


class CCC {
    int i = 10;

    int sum() {
        return getI() + 10;
    }

    int getI() {
        return i;
    }
}

class DDD extends CCC {
    int i = 20;

//    int sum() {
//        return getI() + 10;
//    }

    int getI() {
        return i;
    }
}


