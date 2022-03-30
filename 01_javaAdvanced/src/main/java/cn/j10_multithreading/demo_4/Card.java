package cn.j10_multithreading.demo_4;

/**
 * 银行卡负责存钱
 */
public class Card implements Runnable {
    private String name;
    private Account account = new Account();

    public Card(String name, Account account) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            /**
             * 使用while(true)的作用：

             run方法中的代码就是线程要运行的代码，运行完毕以后，就不会再次运行，其方法本身并不是无限循环的。
             而while(true)是为了让run方法中的代码不断重复的运行，也就是让线程不停的运行，便于查看效果。如果
             去掉，run运行结束，线程也就结束了。

             当然，while(true)并不是run()方法必须的，如果线程的run()部分只需要执行一次，则不需要嵌套while(true)循环。
             */
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //每次存100
            account.addAccount(name, 100);
        }
    }
}
