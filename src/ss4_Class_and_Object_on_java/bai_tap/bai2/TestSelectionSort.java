package ss4_Class_and_Object_on_java.bai_tap.bai2;
import java.util.Random;

public class TestSelectionSort {
    public static void main(String[] args) {
        final int SIZE = 100000;
        int[] array = new int[SIZE];
        Random rand = new Random();

        for (int i = 0; i < SIZE; i++) {
            array[i] = rand.nextInt(1000000);
        }

        StopWatch stopwatch = new StopWatch();

        stopwatch.start();

        selectionSort(array);

        stopwatch.stop();

        System.out.println("Thời gian thực thi selection sort cho 100,000 phần tử là: " +
                stopwatch.getElapsedTime() + " milliseconds.");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
