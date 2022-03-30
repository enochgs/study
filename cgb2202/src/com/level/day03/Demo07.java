package com.level.day03;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符：");
        String str = scanner.nextLine();    //从控制台获取字符给str
        char ch = str.charAt(0);    //从str获取第一个字符
        System.out.println(ch);



    }

}
