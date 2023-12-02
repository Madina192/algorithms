import java.util.Arrays;
import java.util.Scanner;

public class SequenceElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int result = findX(sequence, k);

        System.out.println(result);

        scanner.close();
    }

    private static int findX(int[] sequence, int k) {
        Arrays.sort(sequence);

        if (k == 0) {
            return sequence[0] - 1;
        } else if (k == sequence.length) {
            return sequence[sequence.length - 1];
        } else if (sequence[k - 1] == sequence[k]) {
            return -1;
        } else {
            return sequence[k - 1];
        }
    }
}
