package com.first.api.day01;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";
        //复制str中的内容到builder中---好好学习java
        StringBuilder builder = new StringBuilder(str);

        //append():追加内容
        builder.append(",为了找个好工作！");
        System.out.println(builder);//好好消息java，为了找个好工作！

        //replace():替换部分内容
        builder.replace(9, 16, "就是为了改变世界");//替换9~15的
        System.out.println(builder);

        //delete():删除部分内容
        builder.delete(0, 8);   //删除0~7的
        System.out.println(builder);    //,就是为了改变世界！


    }
}
