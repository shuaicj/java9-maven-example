package shuaicj.example.java9.module.adder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Test Adder.
 *
 * @author shuaicj 2018/01/12
 */
public class AdderTest {

    @Test
    public void test() {
        assertThat(Adder.of().result()).isEqualTo(0);
        assertThat(Adder.of().add(2).result()).isEqualTo(2);
        assertThat(Adder.of().add(2).add(-5).result()).isEqualTo(-3);

        assertThat(Adder.of(2).result()).isEqualTo(2);
        assertThat(Adder.of(2).add(2).result()).isEqualTo(4);
        assertThat(Adder.of(2).add(2).add(-3).result()).isEqualTo(1);

        assertThat(Adder.of(-2).result()).isEqualTo(-2);
        assertThat(Adder.of(-2).add(2).result()).isEqualTo(0);
        assertThat(Adder.of(-2).add(2).add(-5).result()).isEqualTo(-5);
    }
}