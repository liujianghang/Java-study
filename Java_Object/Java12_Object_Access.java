package java_study.Java_Object;

public class Java12_Object_Access {
    public static void main(String[] args) {
        // TODO 面向对象 - 访问权限
        //  public:公共的
        //  java源码中 公共（public）类只能有一个，而且必须和文件名相同
        //  main方法:main方法由java虚拟机调用，因此不需要考虑权限问题，因此是public，应该可以用任意的方式调用：不用考虑参数，所以是static
        //  1.private:私有的 只能自己用
        //  2.（default）:默认权限 当不设定任何权限时，提供该权限（包/路径权限）即必须是完全相同的包路径可以随便用,隔壁文件夹不行！！
        //  3.protected:受保护的权限，子类也可以使用
        //  4.public:公共的 任意地方
        //  同类->同类，同包->同类，同包，子类->所有

        User11 user11 = new User11();
//        System.out.println(user11.name);  无法使用/访问

    }
}

class User11{
    private String name;
    String sex;
    public String age;
    protected String username;
    void test(){
        System.out.println(name);
    }
}

class Child111 extends User11{
    void test(){
        System.out.println(username);
    }
}



