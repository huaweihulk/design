package com.hulk.learn.factoryMethod;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-28 下午9:34
 **/
public class AppleFruitFactory implements IFruitFactory {
    public void createFruit() {
        System.out.println("create apple");
    }
}
