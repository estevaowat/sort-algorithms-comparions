package sort.algorithms.comparions.implementations;

import sort.algorithms.comparions.interfaces.ISortAlgorithm;

public class MergeSort implements ISortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        return mergeSort(numbers, numbers.length);
    }

    public static int[] mergeSort(int[] input, int n) {
        if(n < 2) {
            return new int[0];
        }

        int middleIndex = n / 2;
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[n - middleIndex];

        System.arraycopy(input, 0, leftArray, 0, middleIndex);

        for(int i = middleIndex; i < n; i++) {
            rightArray[i - middleIndex] = input[i];
        }

        mergeSort(leftArray, middleIndex);
        mergeSort(rightArray, n - middleIndex);

        merge(input, leftArray, rightArray, middleIndex, n - middleIndex);

        return input;
    }

    public static void merge(
            int[] input, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while(i < left && j < right) {
            if(l[i] <= r[j]) {
                input[k++] = l[i++];
            } else {
                input[k++] = r[j++];
            }
        }
        while(i < left) {
            input[k++] = l[i++];
        }
        while(j < right) {
            input[k++] = r[j++];
        }
    }
}
