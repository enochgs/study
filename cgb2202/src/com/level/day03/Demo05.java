package com.level.day03;

public class Demo05 {
    public static void main(String[] args) {
        char gender = '女';
        int age = 35;
        //	22899 == 22899 || 35 >= 60
        //		 true	   ||	false
        //				  true
        boolean pass = gender =='女' || age >= 60;
        System.out.println(pass);

    }
}
