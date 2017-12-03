package com.hulk.learn.prototype;

import java.util.List;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-29 上午2:18
 **/
public class ShallowClone implements Cloneable {
    private int a;
    private String b;

    public ShallowClone(int a, String b, Long c, List<String> list) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.list = list;
    }

    private List<String> list;
    private Long c;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
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

    public Long getC() {
        return c;
    }

    public void setC(Long c) {
        this.c = c;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ShallowClone{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", list=" + list +
                ", c=" + c +
                '}';
    }
}
