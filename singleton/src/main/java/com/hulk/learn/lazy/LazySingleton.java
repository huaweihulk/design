package com.hulk.learn.lazy;

/**
 * ipampas 潘帕斯
 * 懒汉式生成，每次都会加锁，导致整个性能慢
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-28 下午10:58
 **/
public class LazySingleton {
    private static LazySingleton singleton;

    public static synchronized LazySingleton instance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
