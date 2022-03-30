package cn.j09_fileio.demo_1;

import java.io.File;

/**
 * File类获取文件属性
 */
public class FileMeth1 {
    public static void main(String[] args) {
        File file = new File("E:/Code/txt/hello.txt");//创建文件操作对象
        showFile(file);
    }

    /**
     * 显示文件信息
     *
     * @param file
     */
    private static void showFile(File file) {
        if (file.exists()) {     //判断文件或目录是否存在
            if (file.isFile()) {     //如果是文件
                System.out.println("名称：" + file.getName());
                System.out.println("相对路径：" + file.getPath());
                System.out.println("绝对路径：" + file.getAbsolutePath());
                System.out.println("文件大小：" + file.length());
            }
            if (file.isDirectory()) {
                System.out.println("是目录");
            } else {
                System.out.println("不是目录");
            }
        }
    }
}
