package cn.j09_fileio.demo_1;

import java.io.File;
import java.io.IOException;

/**
 * File 类 创建、删除文件或目录
 *
 * @author GST
 */
public class FileMeth2 {

    /**
     * 创建文件
     *
     * @param file
     */
    public static void create(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("文件已经创建");
            } else {
                System.out.println("创建失败---文件与目录名重复");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件
     *
     * @param file
     */
    public static void delete(File file) {
        if (file.exists()) {
            file.delete();
            System.out.println("文件已经删除");
        }
    }

    /**
     * 显示文件信息
     *
     * @param file
     */
    private static void showFile(File file) {
        if (file.exists()) {     //判断文件或目录是否存在
            if (file.isFile()) {     //如果是文件
                System.out.println("名称： " + file.getName());
                System.out.println("相对路径：" + file.getPath());
                System.out.println("绝对路径：" + file.getAbsolutePath());
                System.out.println("文件大小：" + file.length());
            }
            if (file.isDirectory()) {
                System.out.println("是目录 ");
            } else {
                System.out.println("不是目录");
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("E:/Code/txt/2.sql");
        create(file);
        //delete(file);
        showFile(file);
    }
}
