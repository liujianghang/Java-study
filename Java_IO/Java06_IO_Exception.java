package java_study.Java_IO;

import java.io.*;

public class Java06_IO_Exception {
    public static void main(String[] args) {
        // TODO java的数据流操作 - 复制 - 对象序列化&反序列化
        //  FileNotFoundException,IOException,ClassNotFoundException,NotSerializableException
        FileInputStream in = null;
        ObjectInputStream objIn = null;
        ObjectOutputStream objOut = null;
        try {
            in = new FileInputStream("xxx");
            in.read();
//            objOut.writeObject();
            objIn.readObject();
        } catch (Exception e) {

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
