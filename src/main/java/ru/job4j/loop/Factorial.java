package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int a = 0; a <= n; a++) {
            if (a > 0) {
                result = result * a;
            } else {
                result = 1;
            }
        }
        return result;
    }
}
