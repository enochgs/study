package com.first.api.day01;

public class IndexOfDemo {
    public static void main(String[] args) {
        //                      111111
        //            0123456789012345
        String str = "thinking in java";
        int index = str.indexOf("in");  //检索in在字符串str中第一次出现的位置
        System.out.println(index);  //2

        index = str.indexOf("in",3);    //从下标为3的位置开始找in第一次出现的位置
        System.out.println(index);  //5

        index = str.indexOf("IN");  //当前字符串不包含IN，所以返回-1
        System.out.println(index);  //-1

        index = str.lastIndexOf("in");
        System.out.println(index);  //9


    }
}
