package sort.algorithms.comparions.implementations;

import sort.algorithms.comparions.interfaces.ISortAlgorithm;

public class BubbleSort implements ISortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length - 1 - i; j++) {
                if(numbers[j] > numbers[j + 1]) {
                    int tempNumber = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempNumber;
                }
            }
        }
        return numbers;
    }
}
