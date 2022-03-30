package cn.j10_multithreading.demo_3;

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
