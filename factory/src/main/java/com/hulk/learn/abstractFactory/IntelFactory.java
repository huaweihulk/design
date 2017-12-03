package com.hulk.learn.abstractFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-28 下午10:35
 **/
public class IntelFactory implements AbstractFactory {
    public void createCpu() {
        ICpu cpu = new IntelCpu();
    }

    public void createMainBord() {
        IMainBord mainBord = new IntelMainBord();
    }
}
