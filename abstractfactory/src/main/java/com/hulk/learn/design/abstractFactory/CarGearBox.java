package com.hulk.learn.design.abstractFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-23 下午11:03
 * @VERSION 1.0
 **/
public class CarGearBox implements GearBox {
    public void createGearBox() {
        System.out.println("create car gearbox");
    }
}
