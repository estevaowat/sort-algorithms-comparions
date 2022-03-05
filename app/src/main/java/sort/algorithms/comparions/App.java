/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort.algorithms.comparions;

import sort.algorithms.comparions.implementations.BubbleSort;
import sort.algorithms.comparions.interfaces.ISortAlgorithm;
import sort.algorithms.comparions.utils.InputCreator;

import java.time.Duration;
import java.time.Instant;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        try {
            final int size = 100000;

            int[] numbers = InputCreator.createArrayWithRandomNumbers(size);
            int[] quickNumbers = numbers.clone();
            int[] mergeNumbers = numbers.clone();

//            System.out.println("Measuring Quick sort");
//            QuickSort quickSort = new QuickSort();
//            measureSortAlgorithm(quickSort, quickNumbers);
//
//            System.out.println("Measuring Merge Sort");
//            MergeSort mergeSort = new MergeSort();
//            measureSortAlgorithm(mergeSort, mergeNumbers);

            System.out.println("Measuring Bubble Sort");
            BubbleSort bubbleSort = new BubbleSort();
            measureSortAlgorithm(bubbleSort, numbers);
        } catch(Exception ex) {
            System.out.println(ex.getCause().toString());
            System.out.println(ex.getMessage());
        }


    }

    private static void measureSortAlgorithm(ISortAlgorithm algorithm, int[] numbers) {
        Instant startInstant = Instant.now();

        int[] sortedNumbers = algorithm.sort(numbers);
        Instant endInstant = Instant.now();

        Duration duration = Duration.between(startInstant, endInstant);
        long durationInNanos = duration.toNanos();
        long durationInMillis = duration.toMillis();
        long durationInSeconds = duration.toSeconds();

        System.out.println("TIME ELAPSED");
        System.out.println("NANOSECONDS: " + durationInNanos);
        System.out.println("MILLISECONDS: " + durationInMillis);
        System.out.println("SECONDS: " + durationInSeconds);

        System.out.println();
    }

}