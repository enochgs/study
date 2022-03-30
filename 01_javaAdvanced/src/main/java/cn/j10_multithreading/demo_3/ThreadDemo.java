package cn.j10_multithreading.demo_3;

/**
 * 测试，银行卡不停地存钱，存折不停地取钱
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //开个银行账号
        Account account = new Account();
        //开号给银行卡
        Card card = new Card("card", account);
        //开号给存折
        Paper paper = new Paper("存折", account);

        Thread thread1 = new Thread(card);
        Thread thread2 = new Thread(paper);

        thread1.start();
        thread2.start();
    }
}
