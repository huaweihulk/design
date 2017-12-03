package com.hulk.learn.design.abstractFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @create 2017-10-23 下午11:15
 * @VERSION 1.0
 **/
public class App {
    public static void main(String[] args) {
        TruckFactory truckFactory = new TruckFactory();
        CarFactory carFactory = new CarFactory();
        truckFactory.createAutoMobile();
        carFactory.createAutoMobile();
    }
}
