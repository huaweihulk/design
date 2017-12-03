package com.hulk.learn.simpleFactory;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-27 下午11:24
 **/
public class SimpleFactory {
    public static Api createApi(int type) {
        if (type == 1) {
            return new ApiImplV1();
        } else if (type == 2) {
            return new ApiImplV2();
        }
        return null;
    }
}
