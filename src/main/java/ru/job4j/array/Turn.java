package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp1 = array.length - index - 1;
            int temp2 = array[index];
            array[index] = array[temp1];
            array[temp1] = temp2;
        }
        return array;
    }
}
