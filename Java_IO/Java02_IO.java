package java_study.Java_IO;

import java.io.*;

public class Java02_IO {
    public static void main(String[] args) {
        // TODO java的数据流操作 - 复制

        File srcFile = new File("D:\\Projects\\java_study\\data\\word.txt");
        File destFile = new File("D:\\Projects\\java_study\\data\\word.txt.copy");

        // TODO 文件输入流(管道对象)
        FileInputStream in = null;
        // TODO 文件输出流(管道对象)
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);

            // TODO 打开阀门 流转数据 输入 只开了一次
            int data = -1;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
