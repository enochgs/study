package cn.j10_multithreading.demo_4;

/**
 * 银行账户
 */
public class Account {
    private int count = 0;

    /**
     * 存钱
     *
     * @param money
     */
    public void addAccount(String name, int money) {

        synchronized (this) {
            //存钱 ，使用同步代码块
            count += money;
            System.out.println(name + "...存入：" + money + "..." + Thread.currentThread().getName());
            selectAcount(name);
        }

    }

    /**
     * 取钱
     *
     * @param money
     */
    public void subAccount(String name, int money) {

        synchronized (this) {
            //先判断账户现在的余额是否够取钱金额
            if (count - money < 0) {
                System.out.println("账户余额不足！");
                return;
            }
            //取钱
            count -= money;
            System.out.println(name + "...取出：" + money + "..." + Thread.currentThread().getName());
            selectAcount(name);
        }
    }


    /**
     * 查询余额
     *
     * @param name
     */
    public void selectAcount(String name) {
        System.out.println(name + "...余额：" + count);
    }
}
