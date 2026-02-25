package A;

import java.util.Arrays;

public class MoveNegativesTo {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        int posIndex = 0; // pointer to place next positive

        // Traverse array
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {          // positive or zero
                int temp = arr[i];
                arr[i] = arr[posIndex];
                arr[posIndex] = temp;
                posIndex++;
            }
        }

        // Print final array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

