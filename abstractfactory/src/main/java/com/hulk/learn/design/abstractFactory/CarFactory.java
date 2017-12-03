package com.hulk.learn.design.abstractFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-23 下午11:02
 * @VERSION 1.0
 **/
public class CarFactory implements AutoMobileFactory {
    CarEngine carEngine = new CarEngine();
    CarGearBox carGearBox = new CarGearBox();
    CarChassis carChassis = new CarChassis();


    public void createAutoMobile() {
        carChassis.createChassis();
        carEngine.createEngine();
        carGearBox.createGearBox();
    }
}
