package sort.algorithms.comparions.implementations;

import sort.algorithms.comparions.interfaces.ISortAlgorithm;

public class BubbleSort implements ISortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        boolean swapped = true;

        for(int i = 0; i < numbers.length - 1 && swapped; i++) {
            swapped = false;
            for(int j = 0; j < numbers.length - i - 1; j++) {
                if(numbers[j] > numbers[j + 1]) {
                    int tempNumber = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempNumber;
                    swapped = true;
                }
            }
        }
        return numbers;
    }
}
