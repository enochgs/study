package com.first.Saturday.s312;

/**
 * 瓶子问题，递归
 * 20元买20个瓶pise
 * 每两个瓶子换一瓶，每三个盖子换一瓶，不能赊欠
 *
 * @author GST
 */
public class E312_2 {

    public static int allpise;//记录购买的pise总数
    public static int lastPingzi;//记录瓶子剩余
    public static int lastGaizi;//记录盖子剩余
    static int x;
    public static void main(String[] args) {
        buyPise(20);
        System.out.println("可以买：" + allpise + "瓶,剩余瓶子数：" + lastPingzi + ",剩余盖子数：" + lastGaizi);
        System.out.println(x);
    }

    public static void buyPise(int mondy) {
        x++;
        int number = mondy;   //可买number瓶
        allpise += number;  //累计每次购买
        //当前有的瓶子、瓶盖
        int currentGzNumber = number + lastGaizi;
        int currentPzNumber = number + lastPingzi;

        //把瓶子、盖子换钱
        int yuan = 0;
        yuan += currentPzNumber / 2;
        lastPingzi = currentPzNumber % 2;
        yuan += currentGzNumber / 3;
        lastGaizi = currentGzNumber % 3;
        if (yuan >= 1) {//直到买到最后一瓶后，且不能再换1元 结束
            buyPise(yuan);
        }
    }

}
