package com.hulk.learn.design.abstractFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-23 下午11:07
 * @VERSION 1.0
 **/
public class TruckFactory implements AutoMobileFactory {
    TruckEngine truckEngine = new TruckEngine();
    TruckGearBox truckGearBox = new TruckGearBox();
    TruckChassis truckChassis = new TruckChassis();

    public void createAutoMobile() {
        truckEngine.createEngine();
        truckGearBox.createGearBox();
        truckChassis.createChassis();
    }
}
