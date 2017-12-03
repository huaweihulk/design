package com.hulk.learn.prototype;

import java.util.ArrayList;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-29 上午2:17
 **/
public class DeepClone implements Cloneable {
    private int a;
    private String b;
    private ArrayList<String> list;
    private Long c;

    public DeepClone(int a, String b, ArrayList<String> list, Long c) {
        this.a = a;
        this.b = b;
        this.list = list;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public Long getC() {
        return c;
    }

    public void setC(Long c) {
        this.c = c;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone deepClone = (DeepClone) super.clone();
        deepClone.setList((ArrayList<String>) list.clone());
        return deepClone;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", list=" + list +
                ", c=" + c +
                '}';
    }
}
