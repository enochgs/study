package com.first.basics.day05;

/**
 * 多表格
 * 九九乘法表
 */
public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*" +i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
