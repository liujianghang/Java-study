package java_study.Java_Object;

public class Java12_Object_Access_1 {
    public static void main(String[] args) {
        // TODO 面向对象 - 访问权限
        //  public:公共的
        //  java源码中 公共（public）类只能有一个，而且必须和文件名相同
        //  main方法:main方法由java虚拟机调用，因此不需要考虑权限问题，因此是public，应该可以用任意的方式调用：不用考虑参数，所以是static
        //  1.private:私有的 只能自己用
        //  2.（default）:默认权限 当不设定任何权限时，提供该权限（包/路径权限）即必须是完全相同的包路径可以随便用,隔壁文件夹不行！！
        //  3.protected:受保护的权限，子类也可以使用
        //  4.public:公共的 任意地方

        User111 user111 = new User111();
//        System.out.println(user111.clone()); // clone()是Object类中的protected方法，但这里User111()虽然是子类但是无法直接使用
        // TODO:
        //  “其他子类的父类来的方法，我这个子类虽然调用了这个子类，但是用不了他的父类的protected方法，只能他自己用”
        //  所谓的访问权限，是访问属性，方法的权力和限制
        //  谁访问？ Java12_Object_Access_1(静态访问) ->super->java.lang.Object
        //  访问谁？ java.lang.clone()->super->java.lang.Object(clone)
    }
}

class User111{
    // TODO
    //  这样就能用
    void test() throws Exception{
        clone();
    }
}





