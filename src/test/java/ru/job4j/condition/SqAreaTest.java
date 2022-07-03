package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 8;
        int p = 12;
        double k = 2;
        double s = SqArea.square(p, k);
        Assert.assertEquals(expected, s, 0.01);
    }
}