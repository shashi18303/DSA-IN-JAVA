package Array;
import java.util.*;

public class FindMissingAndDuplicat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers from 1 to " + n + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicate = -1, missing = -1;

        // Mark visited numbers by making them negative
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]);

            if (arr[index - 1] < 0) {
                duplicate = index;        // number repeated
            } else {
                arr[index - 1] *= -1;     // mark visited
            }
        }

        // Find which index was never visited
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        System.out.println("Duplicate number: " + duplicate);
        System.out.println("Missing number: " + missing);
    }
}
