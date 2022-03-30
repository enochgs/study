package com.first.Saturday.S317;

public class Gamma {
    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = new Inner();
        int n = 10;
        i.setX(n);
        o.setY(i);
        i.setX(100);

        System.out.println(o.getY().getX());
    }
}
