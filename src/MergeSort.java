import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        mergeSortRecursive(new int[]{3, 7, 2, 4, 1, 6, 5});
    }

    private static void mergeSortRecursive(int[] array) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            rightArray[i - mid] = array[i];
        }
        mergeSortRecursive(leftArray);
        mergeSortRecursive(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
        System.out.println("left : " + Arrays.toString(left));
        System.out.println("right : " + Arrays.toString(right));
        System.out.println("array : " + Arrays.toString(array));
    }
}
