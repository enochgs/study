package com.second.java_api.day03_io2;

import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.Arrays;

public class Person implements Serializable {
    /*
        实现序列化接口后最好主动定义序列化版本号这个常量。
        这样一来对象序列化是就不会根据类的结构生成一个版本号，而是使用该固定值
        那么反序列化时，只有还原的对象和当前类的版本号一致就可以进行还原
     */
    private static final long serialVersionUID = 1L;

    private String name;    //姓名
    private int age;    //年龄
    private String gender;  //性别
    private String[] otherInfo; //其他信息

    //java bean
    public Person() {
    }

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}