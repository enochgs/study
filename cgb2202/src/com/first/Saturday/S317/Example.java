package com.first.Saturday.S317;

public class Example {
    String str = new String("tarena");
    char[] ch ={'a','b','c'};

    public static void main(String[] args) {
        Example example = new Example();
        example.change(example.str, example.ch);
        System.out.print(example.str+"and");
        System.out.print(example.ch);
    }
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0]='g';
    }
}
