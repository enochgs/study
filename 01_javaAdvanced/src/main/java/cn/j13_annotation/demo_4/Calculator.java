package cn.j13_annotation.demo_4;

/**
 * 注解案例
 * 简单的测试框架
 * 小明定义的计算器类
 */
public class Calculator {
    //加法
    @Check
    public void add() {
        String str = null;
        str.toString();
        System.out.println("1+0=" + (1 + 0));
    }

    //减法
    @Check
    public void sub() {
        System.out.println("1-0=" + (1 - 0));
    }

    //乘法
    @Check
    public void mul() {
        System.out.println("1*0=" + (1 * 0));
    }

    //加法
    @Check
    public void div() {
        System.out.println("1/0=" + (1 / 0));
    }

    public void show() {
        System.out.println("永无bug...");
    }
}
