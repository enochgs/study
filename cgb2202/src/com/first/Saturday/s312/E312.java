package com.first.Saturday.s312;

/**
 * 递归思想
 */
public class E312 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("第"+i+"个月"+count(i)+"对。");
        }
    }
    public static int count(int x){
        if (x==1 || x==2){
            return 1;
        }
        return count(x-2)+count(x-1);
    }
}
