package A;

import java.util.Arrays;

public class zeros {
	public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};

        int c0 = 0, c1 = 0, c2 = 0;

        // Count 0s, 1s, 2s
        for (int n : arr) {
            if (n == 0) c0++;
            else if (n == 1) c1++;
            else c2++;
        }

        // Fill array again
        int i = 0;
        while (c0--> 0) arr[i++] = 0;
        while (c1-- > 0) arr[i++] = 1;
        while (c2-- > 0) arr[i++] = 2;

        System.out.println(Arrays.toString(arr));
    }
}