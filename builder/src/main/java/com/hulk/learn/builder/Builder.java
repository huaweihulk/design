package com.hulk.learn.builder;

/**
 * ipampas 潘帕斯
 *
 * @author caoyang
 * @version 1.0
 * @create 2017-10-29 上午1:37
 **/
public class Builder {
    private Object partA;
    private Object partB;
    private Object partC;

    public Builder builder() {
        return new Builder();
    }

    public Builder buildPartA(Object partA) {
        this.partA = partA;
        return this;
    }

    public Builder buildPartB(Object partB) {
        this.partB = partB;
        return this;
    }

    public Builder builderPartC(Object partC) {
        this.partC = partC;
        return this;
    }

    public Builder build() {
        return this;
    }
}
