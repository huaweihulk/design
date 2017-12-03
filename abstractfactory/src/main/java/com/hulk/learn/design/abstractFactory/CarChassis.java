package com.hulk.learn.design.abstractFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-23 下午11:04
 * @VERSION 1.0
 **/
public class CarChassis implements Chassis {
    public void createChassis() {
        System.out.println("create car chassis");
    }
}
