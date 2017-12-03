package com.hulk.learn.adapter;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-24 上午12:40
 * @VERSION 1.0
 **/
public class UseFuleAutoMobile implements FuleAutoMobile {
    public void move() {
        System.out.println("use fuel move");
    }

    public void consumeEnergy() {
        System.out.println("consume fuel");
    }

}
