package com.level.day05;

public class Demo01 {
    public static void main(String[] args) {
        String[] names = {"Tom","Andy","JoLin"};
        int lon = names.length;
        System.out.println(lon);
        for (int i = 0; i < names.length; i++) {
            //i= 0 1 2 3
            String name = names[i];
            System.out.println(name);

        }

    }
}
