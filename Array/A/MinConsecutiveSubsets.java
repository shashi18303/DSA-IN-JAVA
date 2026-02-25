package A;

import java.util.Arrays;

public class MinConsecutiveSubsets {
    public static void main(String[] args) {
        int[] arr = {100, 56, 5, 6, 102, 58, 101, 57, 7, 103};

        Arrays.sort(arr);

        int count = 1;  // at least one subset

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                count++;  // new subset starts
            }
        }

        System.out.println(count);
    }
}
