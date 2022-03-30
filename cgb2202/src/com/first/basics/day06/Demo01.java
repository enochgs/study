package com.first.basics.day06;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {5,3,4,22,7,9};
        int max=0;
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
                a=i;
            }
            }
        System.out.println(max+"  "+a);

        for (int i = 9; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t" );
            }
            System.out.println();
        }

    }
}
