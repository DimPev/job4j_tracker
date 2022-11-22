package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To4To8Then8() {
        int left = 1;
        int right = 2;
        int third = 4;
        int fourth = 8;
        int result = Max.max(left, right, third, fourth);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To4Then5() {
        int left = 1;
        int right = 2;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}
