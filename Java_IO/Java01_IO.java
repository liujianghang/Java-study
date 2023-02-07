package java_study.Java_IO;

import java.io.File;
import java.io.IOException;

public class Java01_IO {
    public static void main(String[] args) throws IOException {
        // TODO java的数据流操作 - 文件流
        //  文件流
        //  File 文件类型 属于java.io
        String filepath = "D:\\Projects\\java_study\\data\\word.txt";
        File file = new File(filepath); // 需要关联路径
        System.out.println(file); // D:\Projects\java_study\data\word.txt
        // TODO 文件对象的操作
        //  1.判断当前文件对象是否为文件(可能是文件夹)
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        //  TODO 2.是否存在关联？
        System.out.println(file.exists());

        if (file.exists()){
            if (file.isFile()){
                System.out.println("文件对象关联的是文件");
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath());
            }else {
                System.out.println("文件对象关联的是文件夹");
                String[] list = file.list();// 文件中所有的文件的名称
                for (String s : list) {
                    System.out.println(s);
                }
                File[] files = file.listFiles(); // 所有文件以文件对象返回

            }
        }else {
            System.out.println("文件对象不存在");
            // 创建多级文件目录
//            file.mkdirs();
            file.createNewFile();
        }

    }
}
