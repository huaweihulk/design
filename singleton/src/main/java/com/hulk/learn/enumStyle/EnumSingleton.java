package com.hulk.learn.enumStyle;

/**
 * 推荐这种方式
 */
public enum EnumSingleton {
    instance;

    public static EnumSingleton instance() {
        return instance;
    }
}
