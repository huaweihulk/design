package com.hulk.learn.adapter;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-24 上午12:49
 * @VERSION 1.0
 **/
public class App {
    public static void main(String[] args) {
        FuleAutoMobile fuleAutoMobile = new ElectircFuelFuleAutoMobileAdapter();
        fuleAutoMobile.move();
        fuleAutoMobile.consumeEnergy();
    }
}
