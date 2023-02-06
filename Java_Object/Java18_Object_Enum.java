package java_study.Java_Object;

public class Java18_Object_Enum {
    public static void main(String[] args) {
        // TODO 面向对象 - Enum - 枚举
        //  枚举是一个特殊的类，其中有一组特定的  对象  ，这些对象不会发生改变，一般都用大写的标识符
        //  枚举使用enum关键字使用
        //  枚举类需要将对象放置在最前面，那么和后面的语法需要使用分号隔开
        //  枚举类不能创建对象，对象是在内部自动创建
        System.out.println(City.BEIJING.name);
        System.out.println(City.SHANGHAI.code);
        System.out.println(MyCity.BEIJING.name);
        System.out.println(MyCity.SHANGHAI.code);
    }
}

enum City {
    // 这两个就是City的对象
    BEIJING("北京", 1001), SHANGHAI("上海", 1002);


    City(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String name;
    public int code;
}

// 自己创建的枚举类的意思：
class MyCity {
    public String name;
    public int code;

    private MyCity(String name, int code) {
        this.name = name;
        this.code = code;
    }
    public static final MyCity BEIJING = new MyCity("北京",1001);
    public static final MyCity SHANGHAI = new MyCity("上海",1002);
}

