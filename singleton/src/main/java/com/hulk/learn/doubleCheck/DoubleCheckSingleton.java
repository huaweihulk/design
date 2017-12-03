package com.hulk.learn.doubleCheck;

/**
 * ipampas 潘帕斯
 * 双层检测，一定要用volatile修饰，参照java线程模型设定，查看修饰原因
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-29 上午12:02
 **/
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance = null;

    public static DoubleCheckSingleton instance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
