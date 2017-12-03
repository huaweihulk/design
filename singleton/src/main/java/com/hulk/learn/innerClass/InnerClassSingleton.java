package com.hulk.learn.innerClass;

/**
 * ipampas 潘帕斯
 * <p>
 * 区别于饿汉式，静态内部类只有在使用时才会加载，没有使用时与外部内没有任何关系
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-28 下午11:57
 **/
public class InnerClassSingleton {
    private static class SingletonHoler {
        public static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton instance() {
        return SingletonHoler.instance;
    }
}
