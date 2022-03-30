package com.level.day03;

/**
 * 比较运算符
 * @author GST
 */
public class Demo04 {
    public static void main(String[] args) {
        char gender ='女'; //实际赋值22899
        int age = 66;
        //22899 == 22899 && 66 >= 60
        //      true     &&   true
        //      pass = true
        boolean pass = gender == '女' && age >= 60; //逻辑判断
        System.out.println(pass);

        age = 59;
        //22899 == 22899 && 59 >= 60
        //      true     &&   false
        //      pass = false
        pass = gender == '女' && age >= 60;
        System.out.println(pass);

        age = 88;
        gender ='男'; //实际赋值30007
        //22899 == 22899 && 88 >= 60
        //      true     &&   false
        //      pass = false
        pass = gender == '女' && age >= 60; //逻辑判断
        System.out.println(pass);


    }
}
