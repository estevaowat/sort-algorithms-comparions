package sort.algorithms.comparions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sort.algorithms.comparions.implementations.BubbleSort;

class BubbleSortTest {

    @Test
    @DisplayName("should sort numbers")
    void shouldSortNumbers() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] numbers = {4, 3, 5, 1, 2};
        int[] expected = {1, 2, 3, 4, 5};

        int[] result = bubbleSort.sort(numbers);

        Assertions.assertArrayEquals(expected, result);
    }
}
