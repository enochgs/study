package com.second.java_api.day04_exception;

/**
 * java的异常处理机制
 * java中所有异常的超类为Throwable，其下派生了两个子类型：Error和 Exception
 * Error表示系统错误，通常是不能在程序期间被解决的错误。
 * Exception表示程序级别的错误，通常是由于逻辑等导致的问题，可以在程序运行期间被解决。
 *
 * 异常处理机制中的try-catch
 * 语法：
 * try{
 *     可能出现异常的代码片段
 * }catch(XXXXException e){
 *     try语句块中出现XXXXException后解决办法
 * }
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了。。。。。");
        try {
            //String line = null;
            String line = "";
        /*
            JVM 执行到这里时如果发生了异常就会实例化一个对应的异常实例，并将程序执行
            过程设置进去，然后将异常抛出。
         */
            System.out.println(line.length());
            System.out.println(line.charAt(0));
        }catch (NullPointerException e){
            System.out.println("出现了空指针异常！");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("出现了下标越界异常！");
        }

        System.out.println("结束开始了。。");
    }

}
