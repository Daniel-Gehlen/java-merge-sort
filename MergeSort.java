import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int middle = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, middle);
        int[] rightHalf = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] result, int[] left, int[] right) {
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22};
        mergeSort(numbers);
        System.out.println("Lista ordenada: " + Arrays.toString(numbers));
    }
}
