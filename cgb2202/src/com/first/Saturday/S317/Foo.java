package com.first.Saturday.S317;

public class Foo {
    public String doit(int x,int y){
        return "a";
    }
    public String doit(int[] vals){
        return "b";
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.println(f.doit(4,5));
    }
}
