package com.hulk.learn.design.abstractFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-23 下午11:13
 * @VERSION 1.0
 **/
public class TruckGearBox implements GearBox {
    public void createGearBox() {
        System.out.println("create truck gearbox");
    }
}
