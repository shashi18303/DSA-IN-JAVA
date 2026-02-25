package A;
import java.util.*;

public class MedianUsingSet {

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        // Use TreeSet to remove duplicates and sort
        Set<Integer> set = new TreeSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            set.add(num);
        }

        // Convert set to array for easy median calculation
        Integer[] merged = set.toArray(new Integer[0]);

        int n = merged.length;
        double median;

        if (n % 2 == 1) {
            median = merged[n / 2];
        } else {
            median = (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }

        System.out.println("Median: " + median);
    }
}
