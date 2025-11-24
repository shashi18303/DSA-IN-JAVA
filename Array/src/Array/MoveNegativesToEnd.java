package Array;
import java.util.*;

public class MoveNegativesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        int n = arr.length;
        int posIndex = 0; // index to place next positive number

        // Traverse full array
        for (int i = 0; i < n; i++) {
            // If positive number found
            if (arr[i] >= 0) {
                int temp = arr[i];

                // Shift elements right to preserve order
                int j = i;
                while (j > posIndex) {
                    arr[j] = arr[j - 1];
                    j--;
                }

                arr[posIndex] = temp;
                posIndex++; // next positive goes next
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
