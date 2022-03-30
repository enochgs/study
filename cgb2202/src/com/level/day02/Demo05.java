package com.level.day02;

/**
 * 运算符
 * @author GST
 */
public class Demo05 {
    public static void main(String[] args) {
        /**
         * 整型运算
         */
        //正常数学运算
        int n = 6;
        int m =8;
        int k = n +m;
        System.out.println(k);

        //不同类型参与运算，会先转换类型再进行计算
        long l = 200;
        //int + long -> long +long
        long x = n +l;
        System.out.println(x);
        //整除：整数除以整数得到整数
        n =60;
        k = n / 10;	//k = 6
        n = 61;
        k = n/ 10;	//k = 6
        System.out.println(k);

        /**
         * 浮点型运算
         */
        //浮点数除法
        double d1 = 61.0;
        double d2 = d1 / 10;	//10是int 自动转换为double 然后double同类型作运算
        System.out.println(d2);

        //容易出现的错误
        n = 61;
        d2 = n / 10;
        System.out.println(d2); //int计算后的结果转double

        d2 = n / 10.0;
        System.out.println(d2); //计算过程中转double
        d2 = n / 10D;
        System.out.println(d2);

        //案例分析
        double v1 = 60;
        //float c1 = v1 / 9;
        float c1 =(float) (v1 / 9); //可以把double的结果强转为float
        //float c1 =(float) v1 / 9; //(float) v1在运算当中优先级最高，不要这样单独转换，而是上面的整体转换
        System.out.println(c1);

        //浮点数计算不精确现象
        double dx = 2.3;
        System.out.println(dx-2.0);

    }
}
