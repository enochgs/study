package com.first.basics.day02;

/**
 *  char: 字符型，2个字节
 *
 */
public class Demo07 {
    public static void main(String[] args) {
        char c1 = '女';  //字符 女
        char c2 = 'f';  //字符 f
        char c3 = '6';  //字符 6
        char c4 = '*';  //字符 *
        //char c5 = 女; //编译错误,字符直接量必须放在单引号中;
        //char c6 = '';//编译错误，必须有字符
        //char c7 = '学字符'; //编译错误，必须有字符
        char c8 = 65; //0到65535 之间  ---- 一般不这么用
        System.out.println(c8); //输出时会依据c8的数据类型来显示
        //c8为char型，则显示为字符
        char c9 = '\\';
        System.out.println(c9); // \
    }
}
