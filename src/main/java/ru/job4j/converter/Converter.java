package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float euro = Converter.rubleToEuro(in);
        float dollar = Converter.rubleToDollar(in);
        boolean passed1 = expected == euro;
        boolean passed2 = expected == dollar;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        System.out.println("140 rubles are 2 dollar. Test result : " + passed2);
    }
}