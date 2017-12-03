package com.hulk.learn.design.abstractFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-23 下午11:14
 * @VERSION 1.0
 **/
public class TruckChassis implements Chassis {
    public void createChassis() {
        System.out.println("create truck chassis");
    }
}
