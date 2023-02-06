package java_study.Java_Object;

public class Java20_Object_Bean {
    public static void main(String[] args) {
        // TODO 面向对象 - Bean - bean规范
        //  1.主要用于编写逻辑
        //  2.主要用于建立模型
        //  Bean规范
        //  1. 类要求必须有无参，公共的构造方法
        //  2. 属性必须私有化，然后提供共公共的，set，get方法
        User20 user = new User20();
        user.setAccount("admin");
        user.setPassword("admin");
        login(user);

    }

    public static boolean login(User20 user) {

        if (user.getAccount().equals("admin") && user.getPassword().equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}

class User20 {
    private String account; // 这些属性应该是私有的
    private String password;

    //    public boolean login(){  // 这样写不是很好 因为提供login功能的应该是平台
//        return true;
//    }
    // TODO
    //  对外提供 提供,设置 名字和密码的方法
    //  idea快捷键 alt+insert
    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}

