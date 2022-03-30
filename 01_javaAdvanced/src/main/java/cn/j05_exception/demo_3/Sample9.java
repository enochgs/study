package cn.j05_exception.demo_3;

/**
 * 使用throw在方法内抛出异常
 * throws Exception 加在方法参数后，throw加在方法内
 *
 * @author GST
 */
public class Sample9 {
    private String name = "张三";   //姓名
    private String sex = "man"; //性别
    private int age; //年龄

    /**
     * 设置性别
     *
     * @param sex 性别
     * @throws Exception
     */
    public void setSex(String sex) throws Exception {
        if ("man".equals(sex) || "woman".equals(sex)) {
            this.sex = sex;
        } else {
            throw new Exception("性别是\"man\" or \"woman\"!");
        }

    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 打印基本信息
     */
    public void print() {
        System.out.println("我的名字:" + name + "，性别:" + sex + "，年龄:" + age);
    }

}
