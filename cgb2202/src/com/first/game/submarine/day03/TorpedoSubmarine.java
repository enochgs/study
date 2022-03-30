package com.first.game.submarine.day03;

import java.util.Random;

/**
 * 鱼雷潜艇
 * @author GST
 * 提取实体类公共部分作超类，被提取的类都是子类
 * 关键词：继承、超类、子类，引用类型数组
 */
public class TorpedoSubmarine extends SeaObject {

    public TorpedoSubmarine() {
        super(64,20);
    }

}
