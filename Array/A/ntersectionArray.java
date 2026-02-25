package A;

import java.util.*;

public class ntersectionArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Store elements of nums1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check common elements
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}

