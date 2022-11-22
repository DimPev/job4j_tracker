package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to20then1() {
        double expected = 1;

        Point a = new Point(3, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when38to21then7dot07() {
        double expected = 7.07;
        Point a = new Point(3, 8);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to22then0() {
        double expected = 0;
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to10then0() {
        double expected = 0;
        Point a = new Point(1, 0);
        Point b = new Point(1, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when202to022then2dot8() {
        double expected = 2.8;
        Point a = new Point(2, 0, 2);
        Point b = new Point(0, 2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when100to100then0() {
        double expected = 0;
        Point a = new Point(1, 0, 0);
        Point b = new Point(1, 0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
