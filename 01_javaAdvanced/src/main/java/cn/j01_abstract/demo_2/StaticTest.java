package cn.j01_abstract.demo_2;

/**
 * static用法
 * static修饰符：可以用来修饰属性、方法和代码块。
 * static修饰的变量属于这个类所有，即由这个类创建的所有对象共用同一个static变量。
 * 通常被static修饰的属性和方法称为类属性(类变量)和类方法，
 * 不使用static修饰属于单个对象，通常称为实例属性、实例方法。
 * 主题：static的用法 构造方法错误写法
 *
 * @author GST
 * @ demo_2 构造方法及其重载
 */
public class StaticTest {
    static int j;
    static int s = 80;
    int i;
    int k = 55;

    /**
     * 静态代码块
     */
    static {
        j = 5;
        System.out.println("j的初始值为：" + j + "\t--->静态代码块");
    }

    /**
     * 常见错误1
     * 无参构造方法
     * 加 void 修饰符，实例化时并不会初始化赋值，即这是错误写法,不是构造方法
     */
    //public void StaticTest(){
    public StaticTest() {
        i = 20;
        System.out.println("i的初始值为：" + i + "\t--->无参构造方法");
    }

    /**
     * 常见错误2
     * 静态方法
     * 无论是静态方法或是普通方法中定义局部静态变量，都会报错，类变量不能定义在局部
     */
    public static void getNum() {
        //static int l=12;     //报错。方法里不能定义static变量
        //this.i=i+1;   //报错。静态方法中不能使用this 和super 关键字。
        System.out.println("得到j的值为：" + j + "\t--->类名.方法名");
    }

    /**
     * 常见错误2
     * 普通方法
     * 无论是静态方法或是普通方法中定义局部静态变量，都会报错，类变量不能定义在局部
     */
    public void getNum2() {
        //static int l=12;     //报错。方法里不能定义static变量
        int l = 12;   //局部变量
        System.out.println("得到l的值为：" + l + "\t--->对象名.方法名");
    }


    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        /**
         * 结论：1.在类加载过程中完成静态变量的内存分配，再执行静态代码块，两者都是在创建对象前执行的。
         *      2. 类属性、类方法可以通过类名和对象名访问，而实例属性、实例方法只能通过对象名访问。
         *      3.类方法只能访问类属性和其他类方法。
         * 注意：1.静态方法中不能使用this 和super 关键字。
         *      2.在方法里不能定义static变量
         */
        System.out.println("-----------------------------------------" +
                "\nj的值为：" + StaticTest.j + "\t--->类名.变量名");
        StaticTest.getNum();    //也可以这样访问：test.getNum();

        System.out.println("s的值为：" + test.s + "\t--->对象名.变量名"); //类属性、类方法可以通过类名和对象名访问

        //报错 java: 无法从静态上下文中引用非静态 变量 k
        // System.out.println("k的值为："+StaticTest.k+"\t--->对象名.变量名");
        System.out.println("k的值为：" + test.k + "\t--->对象名.变量名"); //实例属性、实例方法只能通过对象名访问
        //StaticTest.getNum2();  //报错。普通方法不能使用类名调用
        test.getNum2();
    }


}
