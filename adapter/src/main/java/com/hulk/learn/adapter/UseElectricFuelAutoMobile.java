package com.hulk.learn.adapter;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-24 下午9:53
 * @VERSION 1.0
 **/
public class UseElectricFuelAutoMobile implements ElectricFuelAutoMobile {
    public void move() {
        System.out.println("use fuel electric move");
    }

    public void consumeFuel() {
        System.out.println("consume fuel");
    }

    public void consumeElectric() {
        System.out.println("use electric");
    }
}
