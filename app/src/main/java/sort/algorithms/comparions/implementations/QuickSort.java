package sort.algorithms.comparions.implementations;

import sort.algorithms.comparions.interfaces.ISortAlgorithm;
import sort.algorithms.comparions.utils.InputCreator;

import java.util.Stack;

public class QuickSort implements ISortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        InputCreator.printArray(numbers);
        Stack stack = new Stack();
        stack.push(0);
        stack.push(numbers.length);
        while(!stack.isEmpty()) {

            int end = (int) stack.pop();
            int start = (int) stack.pop();
            if(end - start < 2) {
                continue;
            }
            int p = start + ((end - start) / 2);
            p = partition(numbers, p, start, end);
            stack.push(p + 1);
            stack.push(end);
            stack.push(start);
            stack.push(p);
        }

        InputCreator.printArray(numbers);

        return numbers;
    }


    private static int partition(int[] input, int position, int start, int end) {
        int l = start;
        int h = end - 2;
        int piv = input[position];
        swap(input, position, end - 1);
        while(l < h) {
            if(input[l] < piv) {
                l++;
            } else if(input[h] >= piv) {
                h--;
            } else {
                swap(input, l, h);
            }
        }
        int idx = h;
        if(input[h] < piv) {
            idx++;
        }
        swap(input, end - 1, idx);
        return idx;
    }


    static void swap(int[] arr, int low, int pivot) {
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }


}
