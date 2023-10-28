import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 5};
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min]) { //just change < to > to sort in descending order
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}