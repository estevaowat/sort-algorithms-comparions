package sort.algorithms.comparions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sort.algorithms.comparions.implementations.QuickSort;

class QuickSortTest {

    @Test
    @DisplayName("should sort numbers")
    void shouldSortNumbers() {
        QuickSort quickSort = new QuickSort();
        int[] numbers = {4, 3, 5, 1, 2};
        int[] expected = {1, 2, 3, 4, 5};

        int[] result = quickSort.sort(numbers);

        Assertions.assertArrayEquals(expected, result);
    }
}