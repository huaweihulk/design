package com.hulk.learn.eager;

/**
 * ipampas 潘帕斯
 *
 * 饿汉式生成，在类加载的时候就会生成对应的类，可能导致资源浪费
 *
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-28 下午11:02
 **/
public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton instance() {
        return eagerSingleton;
    }
}
