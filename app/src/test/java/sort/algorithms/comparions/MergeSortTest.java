package sort.algorithms.comparions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sort.algorithms.comparions.implementations.MergeSort;

class MergeSortTest {
    @Test
    @DisplayName("should sort using merge sort algorithm")
    void shouldSortUsingMergeSortAlgorithm() {
        MergeSort mergeSort = new MergeSort();
        int[] input = {5, 1, 6, 2, 3, 4};

        int[] result = mergeSort.sort(input);

        int[] expected = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expected, result);
    }


}