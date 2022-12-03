package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {
    @Test
    public void whenMinus() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Fact().calc(-6);
                });
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish.");
    }

    @Test
    public void whenFact6() {
        int num = 3;
        int expected = 6;
        int result = new Fact().calc(num);
        assertThat(result).isEqualTo(expected);
    }
}