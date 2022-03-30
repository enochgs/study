package com.first.basics.day06;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        int num =26;
        char[] chars = new char[num];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (Math.random()*26+97);
            for (int j = 0; j < i; j++) {
                if (chars[i]==chars[j]){
                    i--;
                    break;
                }
            }
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码：");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();


        String ver = scanner.next();
        StringBuilder builder = new StringBuilder();//字符串转数组
        for (char s:chars
             ) {
            builder.append(s);  //拼接字符串到builder
        }
        System.out.println(builder.toString());
        if (builder.toString().equals(ver)){    //调用builder的tostring方法转为String类型
            System.out.println("验证码正确！");
        }else{
            System.out.println("输入验证码错误！");
        }
    }

}
