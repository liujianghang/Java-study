package java_study.Java_IO;

import java.io.*;

public class Java04_IO_String {
    public static void main(String[] args) {
        // TODO java的数据流操作 - 复制 - 字符流
        //  读取字符 转化为字节后，再做处理

        File srcFile = new File("D:\\Projects\\java_study\\data\\word.txt");
        File destFile = new File("D:\\Projects\\java_study\\data\\word.txt.copy");

        // TODO 字符输入流(管道对象)
        BufferedReader reader = null;
        // TODO 字符输出流(管道对象)
        PrintWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(srcFile));
            writer = new PrintWriter(destFile);

            // TODO 读取文件中一行数据
            String line = null;

            while ((line = reader.readLine()) != null) {
                writer.println(line);
                System.out.println(line);
            }
            writer.flush(); // 强制刷鞋缓冲区

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
