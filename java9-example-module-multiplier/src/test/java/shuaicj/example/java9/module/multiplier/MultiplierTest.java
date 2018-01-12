package shuaicj.example.java9.module.multiplier;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Test Multiplier.
 *
 * @author shuaicj 2018/01/12
 */
public class MultiplierTest {

    @Test
    public void test() {
        assertThat(Multiplier.of().result()).isEqualTo(1);
        assertThat(Multiplier.of().multiply(2).result()).isEqualTo(2);
        assertThat(Multiplier.of().multiply(2).multiply(-5).result()).isEqualTo(-10);

        assertThat(Multiplier.of(2).result()).isEqualTo(2);
        assertThat(Multiplier.of(2).multiply(2).result()).isEqualTo(4);
        assertThat(Multiplier.of(2).multiply(2).multiply(-3).result()).isEqualTo(-12);

        assertThat(Multiplier.of(-2).result()).isEqualTo(-2);
        assertThat(Multiplier.of(-2).multiply(2).result()).isEqualTo(-4);
        assertThat(Multiplier.of(-2).multiply(2).multiply(-5).result()).isEqualTo(20);
    }
}