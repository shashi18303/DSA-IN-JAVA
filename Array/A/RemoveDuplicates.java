package A;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {21, 2, 2, 6, 2};

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int[] result = Arrays.copyOf(arr, j );
        System.out.println(Arrays.toString(result));
    }
}
