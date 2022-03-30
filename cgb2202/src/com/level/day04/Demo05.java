package com.level.day04;

import java.util.Scanner;

/**
 * 字符串多路分支
 * command: 命令
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入处理命令：");
        String command = scanner.nextLine();
        if (command.equals("以旧换新")){
            System.out.println("开始旧机换新机");
        } else if (command.equals("折价销售")){
            System.out.println("折价1000块");
        } else if(command.equals("现金购买")) {
            System.out.println("8848不锈钢手机");
        } else {
            System.out.println("你说啥，不认得！");
        }
        System.out.println("完成");
    }
}
