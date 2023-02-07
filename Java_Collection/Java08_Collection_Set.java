package java_study.Java_Collection;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Java08_Collection_Set {
    public static void main(String[] args) {
        // TODO - Set
        //  Sort 排序
        //  hash：hash算法
        HashSet<User9> set = new HashSet<>();

        // TODO
        //  改写了方法后
        //  可以认为下面两个数据是同一个数据
        //  HashSet先比较地址 然后比较equals
        User9 user9 = new User9();
        user9.id = 1001;
        user9.name = "zhangsan";
        System.out.println(user9.hashCode());
        User9 user91 = new User9();
        user91.id = 1001;
        user91.name = "zhangsan";
        System.out.println(user91.hashCode());
        User9 user92 = new User9();
        // 这个数据就不是同一个数据了
        user92.id = 1001;
        user92.name = "lisi";
        System.out.println(user92.hashCode());

        set.add(user9);
        set.add(user91);
        set.add(user92);
        System.out.println(set);
    }
}

class User9 {
    public int id;
    public String name;

    @Override
    // 判断两个对象的属性是否完全相同
    public boolean equals(Object o) {
        if (o instanceof User9) {
            User9 otherUser = (User9) o;
            if (otherUser.id == this.id) {
                if (otherUser.name.equals(this.name)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        // 这样的话就是id相同，那么两个值的位置就相同
        return id;
    }

    @Override
    public String toString() {
        return "User" + "[" + id + "," + name + "]";
    }
}

