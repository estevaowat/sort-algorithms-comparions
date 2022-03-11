package sort.algorithms.comparions.utils;

import java.util.Random;

public class InputCreator {
    public static int[] createRandomInputs(int size) {
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

    public static int[] createOrderedAscInputs(int size) {
        int[] result = new int[size];

        for(int i = 0; i < size; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public static int[] createOrderedDescInputs(int size) {
        int[] result = new int[size];

        for(int i = size; i > 0; i--) {
            result[size - i] = i;
        }

        return result;
    }

    public static void printArray(int[] input) {
        for(int element : input) {
            System.out.print(element + " ");
        }
    }
}
