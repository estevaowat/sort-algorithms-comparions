package sort.algorithms.comparions.utils;

import java.util.Random;

public class InputCreator {
    public static int[] createArrayWithRandomNumbers(int size) {
        int[] numbers = new int[size];

        for(int i = 0; i < size; i++) {
            numbers[i] = getRandomNumber(size);
        }

        return numbers;
    }

    public static int getRandomNumber(int size) {
        Random randomizer = new Random();
        final int bound = 100000;
        return randomizer.nextInt(bound);
    }


}
