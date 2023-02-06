package java_study.Java_Exception;

import javax.swing.*;

public class Java07_Exception {
    public static void main(String[] args) throws Exception {
        // TODO - 异常 - 自定义异常
        String account = "123123";
        String password = "123admin";
//        login(account, password); //AccountException
        try {
            login(account, password); //AccountException
        } catch (AccountException e) {
            System.out.println("账号不正确");
        } catch (PasswordException e) {
            System.out.println("密码不正确");
        } catch (LoginException e) {
            System.out.println("其他登录错误");
        }
    }

    //    public static void login(String account, String password) {
    public static void login(String account, String password) throws LoginException { // 抛出大类
        if (!"admin".equals(account)) {
            throw new AccountException("账号不正确");
        }
        if (!"admin".equals(account)) {
            throw new PasswordException("密码不正确");

        }
    }
}

class AccountException extends LoginException {
    public AccountException(String message) {
        super(message);
    }
}

class PasswordException extends LoginException {
    public PasswordException(String message) {
        super(message);
    }
}

// TODO 自定义异常
class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}


