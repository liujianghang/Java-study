package java_study.Java_Object;
public class Java10_Object_Overload {
    public static void main(String[] args) {
        // TODO 面向对象 - 重载
        //  一个类中，方法名相同，参数不同，和返回类型无关
        //  构造方法也有重载
        User10 user10 = new User10();
    }
}


class User10 {
    void login(String account,String password){
        System.out.println("密码登录");
    }
    void login(int phone){
        System.out.println("手机号登录");
    }
    void login(){
        System.out.println("其他的登陆方式");
    }
}

