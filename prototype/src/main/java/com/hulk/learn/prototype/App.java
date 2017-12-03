package com.hulk.learn.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-29 上午2:19
 **/
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list = Arrays.asList("a", "b", "c");
        ShallowClone source = new ShallowClone(0, "b", 1L, list);
        ShallowClone target = (ShallowClone) source.clone();
        System.out.println(target);
        source.setB("c");
        source.getList().set(0, "d");
        System.out.println(target);


        ArrayList<String> deepList = new ArrayList<String>();
        deepList.add("a");
        deepList.add("b");
        deepList.add("c");
        deepList.add("d");
        DeepClone deepSource = new DeepClone(0, "b", deepList, 1L);
        DeepClone deepTarget = (DeepClone) deepSource.clone();
        System.out.println(deepTarget);
        deepSource.setB("c");
        deepSource.getList().set(0, "d");
        System.out.println(deepTarget);
    }
}
