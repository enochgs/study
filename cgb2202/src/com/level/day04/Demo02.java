package com.level.day04;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 比较字符串相等
         * guy: 家伙，某人
         */
        String name = "Cat";
        String guy = name;
        // == 比较同一个字符串的时候得到 true
        System.out.println(name == guy);    //true
        //new String("Tom") 创建了一个新字符串
        String person =new String("Cat");
        System.out.println(name);
        System.out.println(person);
        // == 比较两个内容一样的不同字符串时候用，会出现false
        System.out.println(person == name);
        String person1 =new String("Cat");
        System.out.println(person == person1);
        /*
         *必须使用equals方法比较两个字符串是否相等
         */
        //name guy person 只有内容一样，equals 方法比较结果就是true
        System.out.println(name.equals(guy));
        System.out.println(person.equals(name));
        System.out.println(person.equals(person1));

    }
}
