package com.second.java_api.day01_file;

import java.io.File;
import java.io.FileFilter;

/**
 *  filter：过滤器
 *  accept: 接受
 *  contains: 包含
 *  有条件的获取一个目录的子项
 *
 *  File有一个重载的listFiles方法, 允许我们传入一个文件过滤器，并在该过滤器上定义过滤条件，
 *  之后listFiles执行完毕会将目录中所有满足过滤器要求的子项进行返回
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {

        //获取当前目录中名字里含有字母"o"的子项
        File dir = new File(".");

        if (dir.isDirectory()){
            /*
                File listFiles(FileFilter filter);
             */
            /*
            FileFilter filter = new MyFilter();
             */
            FileFilter filter = new FileFilter(){
                @Override
                public boolean accept(File file) {  //过滤规则
                    System.out.println("正在过滤："+file.getName());
                    return file.getName().contains("o");
                    //startsWith("D");//返回以D开头的文件名
                }
            };
            /*
                File[] listFiles(File filter)

             */
            //File[] subs = dir.listFiles(); //不加过滤器，全部文件名都传进来
            File[] subs = dir.listFiles(filter);//传符合过滤器规则的文件名
            System.out.println("共："+subs.length+"个子项");
            for (int i = 0; i < subs.length; i++) {
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }

    }
}

/**
 * 过滤器
 * 继承FileFilter
 * 上面主函数仅仅使用一次这个类，可以在主函数使用匿名内部类
 */
class MyFilter implements FileFilter{

    @Override
    public boolean accept(File file) {
        //过滤条件是名字中含有“o”的
        String name = file.getName();   //获取file表示的文件或目录的名字
        /*
        String regex  = ".*o.*"; //正则表达式写法
        boolean matches = name.matches(regex);

        boolean o = name.indexOf("o") >= 0;
        */

        boolean contains = name.contains("o");
        return contains;
    }
}
