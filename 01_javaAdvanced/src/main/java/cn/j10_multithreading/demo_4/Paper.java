package cn.j10_multithreading.demo_4;

/**
 * 存折负责取钱
 */
public class Paper implements Runnable {
    private String name;
    private Account account = new Account();

    public Paper(String name, Account account) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //每次取出50
            account.subAccount(name, 50);
        }
    }
}
