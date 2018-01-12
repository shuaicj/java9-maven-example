package shuaicj.example.java9.module.adder;

import shuaicj.example.java9.module.adder.impl.AdderImpl;

/**
 * Simple adder.
 *
 * @author shuaicj 2018/01/11
 */
public interface Adder {

    Adder add(int i);

    int result();

    static Adder of() {
        return of(0);
    }

    static Adder of(int value) {
        return new AdderImpl(value);
    }
}
