package com.hulk.learn.adapter;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-24 上午12:48
 * @VERSION 1.0
 **/
public class ElectircFuelFuleAutoMobileAdapter implements FuleAutoMobile {
    private ElectricFuelAutoMobile electricFuelAutoMobile = new UseElectricFuelAutoMobile();

    public void move() {
        electricFuelAutoMobile.move();
    }

    /**
     * 先消耗电能，再消耗燃油
     */
    public void consumeEnergy() {
        electricFuelAutoMobile.consumeElectric();
        electricFuelAutoMobile.consumeFuel();
    }
}
