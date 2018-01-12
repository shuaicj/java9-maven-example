package shuaicj.example.java9.module.multiplier;

import shuaicj.example.java9.module.multiplier.impl.MultiplierImpl;

/**
 * Simple multiplier.
 *
 * @author shuaicj 2018/01/11
 */
public interface Multiplier {

    Multiplier multiply(int i);

    int result();

    static Multiplier of() {
        return of(1);
    }

    static Multiplier of(int value) {
        return new MultiplierImpl(value);
    }
}
