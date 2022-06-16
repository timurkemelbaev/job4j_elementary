package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float euro = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, euro, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float dollar = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, dollar, eps);
    }
}