package cn.j08_dataaccesslayer.demo;

/**
 * 实体类，操作的对象
 */
public class Student {
    //私有属性，编号，姓名和性别
    private int No;
    private String name;
    private String sex;

    //set,get方法，通过set方法进行设置，通过get方法进行获取
    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {   //无参构造方法
        super();
    }

    //有参构造方法
    public Student(int no, String name, String sex) {
        No = no;
        this.name = name;
        this.sex = sex;
    }

    //toString方法，可以把对象的信息以字符串的形式返回出去
    @Override
    public String toString() {
        return "Student{" +
                "No=" + No +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

}
