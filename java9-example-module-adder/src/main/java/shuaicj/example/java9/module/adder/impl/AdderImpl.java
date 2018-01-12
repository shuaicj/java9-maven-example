package shuaicj.example.java9.module.adder.impl;

import shuaicj.example.java9.module.adder.Adder;

/**
 * Simple adder implementation.
 *
 * @author shuaicj 2018/01/11
 */
public class AdderImpl implements Adder {

    private int value;

    public AdderImpl(int value) {
        this.value = value;
    }

    @Override
    public Adder add(int i) {
        value += i;
        return this;
    }

    @Override
    public int result() {
        return value;
    }
}
