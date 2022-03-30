package com.level.day04;

import java.util.Scanner;

public class Demo03 {

    public static void main(String[] args) {
        /**
         * 检查用户输入的字符串是否为"换机"
         * method: 方式，方法
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入购买方式："); //"换机"
        String method = scanner.nextLine();//"换机"
        /*
        if (method == "换机"){
            System.out.println("以旧换新，环保达人！");
        }else {
            System.out.println("直接购买！");
        }
            */
        if (method.equals("换机")){
            System.out.println("以旧换新，环保达人！");
        }else {
            System.out.println("直接购买！");
        }

    }
}
