package com.first.object_oriented.practice;

public class Example {
    String str = new String("tarena");
    char[] ch ={'a','b','c'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str+"and");
        System.out.println(ex.ch);
    }

    public void change(String str,char ch[]){
        str ="test ok";
        ch[0] ='g';
    }
}
