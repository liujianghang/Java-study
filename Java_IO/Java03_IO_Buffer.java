package java_study.Java_IO;

import java.io.*;

public class Java03_IO_Buffer {
    public static void main(String[] args) {
        // TODO java的数据流操作 - 复制 - 缓冲流

        File srcFile = new File("D:\\Projects\\java_study\\data\\word.txt");
        File destFile = new File("D:\\Projects\\java_study\\data\\word.txt.copy");

        // TODO 文件输入流(管道对象)
        FileInputStream in = null;
        // TODO 文件输出流(管道对象)
        FileOutputStream out = null;
        // TODO 缓冲输入流(管道对象)
        BufferedInputStream buffIn = null;
        // TODO 缓冲输出流(管道对象)
        BufferedOutputStream buffOut = null;
        // TODO 缓冲区(水桶)
        byte[] cache = new byte[1024];
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);
            buffIn = new BufferedInputStream(in); // 对接管子
            buffOut = new BufferedOutputStream(out); // 对接管子

            // TODO 打开阀门 流转数据 输入 只开了一次
            //  效率低
            int data = -1;
            while ((data = buffIn.read(cache)) != -1) {
                buffOut.write(cache, 0, data);// 从0写到data 读多少 写多少
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (buffIn != null) {
                try {
                    buffIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (buffOut != null) {
                try {
                    buffOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
