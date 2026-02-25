package A;

import java.util.*;

public class AlternatePositiveNegative {

    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Step 1: Separate positives and negatives
        for (int num : arr) {
            if (num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        // Step 2: Add alternately (positive first)
        while (i < pos.size() && j < neg.size()) {
            result.add(pos.get(i++));
            result.add(neg.get(j++));
        }

        // Step 3: Add remaining elements
        while (i < pos.size())
            result.add(pos.get(i++));

        while (j < neg.size())
            result.add(neg.get(j++));

        // Print result
        System.out.println(result);
    }
}
