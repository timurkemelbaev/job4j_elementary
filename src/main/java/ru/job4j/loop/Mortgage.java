package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while (amount * (percent / 100) + amount > salary) {
            amount += amount * percent / 100 - salary;
            year++;
        }
        return year;
    }
}
