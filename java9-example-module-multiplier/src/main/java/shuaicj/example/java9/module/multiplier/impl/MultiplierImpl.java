package shuaicj.example.java9.module.multiplier.impl;

import shuaicj.example.java9.module.adder.Adder;
import shuaicj.example.java9.module.multiplier.Multiplier;

/**
 * Simple multiplier implementation.
 *
 * @author shuaicj 2018/01/11
 */
public class MultiplierImpl implements Multiplier {

    private int value;

    public MultiplierImpl(int value) {
        this.value = value;
    }

    @Override
    public Multiplier multiply(int i) {
        if (i == 0) {
            value = 0;
        } else if (i > 0) {
            value = calculate(value, i);
        } else {
            value = - calculate(value, -i);
        }
        return this;
    }

    @Override
    public int result() {
        return value;
    }

    private int calculate(int v, int m) {
        Adder adder = Adder.of();
        for (int i = 0; i < m; i++) {
            adder.add(v);
        }
        return adder.result();
    }
}
