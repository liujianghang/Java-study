package java_study.Java_IO;

import java.io.*;

public class Java05_IO_Object {
    public static void main(String[] args) {
        // TODO java的数据流操作 - 复制 - 对象序列化&反序列化
        //  读取字符 转化为字节后，再做处理

        File dataFile = new File("D:\\Projects\\java_study\\data\\obj.dat");


        // TODO 对象输出流
        ObjectOutputStream objectOut = null;
        FileOutputStream out = null;
        ObjectInputStream objectIn = null;
        FileInputStream in = null;


        try {
//            out = new FileOutputStream(dataFile);
//            objectOut = new ObjectOutputStream(out);

            // TODO java中只有增加了特殊标记的类才能在写文件的时候进行序列化操作
            //  这里的标记就是一个接口
//            User user = new User();
//            objectOut.writeObject(user);
//            objectOut.flush();
            in = new FileInputStream(dataFile);
            // TODO 从文件中读取数据转换成对象
            objectIn = new ObjectInputStream(in);
            Object o = objectIn.readObject();
            System.out.println(o); // java_study.Java_IO.User@1a93a7ca


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (objectOut != null) {
                try {
                    objectOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
// 加标记
class User implements Serializable{

}
