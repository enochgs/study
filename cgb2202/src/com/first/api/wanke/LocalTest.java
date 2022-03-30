package com.first.api.wanke;

public class LocalTest {
    public static void main(String[] args) {
        String name = "www.tedu.cn";
        String name1 = "www.tarena.com.cn";
        String name2 = "http://www.google.com";

        String str = getName(name);
        System.out.println(str);    //想得到tedu
        String str1 = getName(name1);
        System.out.println(str1);    //想得到tarena
        String str2 = getName(name2);
        System.out.println(str2);    //想得到google
    }

    /**
     * 获取给定网址中的域名
     * @param line  网址
     * @return      返回域名
     */
    public static String getName(String line){
        //01234567890123456
        //www.tarena.com.cn //第一个点和第二个点之间的就是域名
        int start = line.indexOf(".")+1;  //第一次点的位置:4，加1的目的是为了找到点后面的那个
        int end = line.indexOf(".",start);    //10，从start之后开始找后一个点的位置
        return line.substring(start,end);

    }
}
