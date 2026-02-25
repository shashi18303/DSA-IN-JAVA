package A;

import java.util.*;

public class UnionArra {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2, 3};

        Set<Integer> union = new HashSet<>();

        // Add elements of first array
        for (int num : nums1) {
            union.add(num);
        }

        // Add elements of second array
        for (int num : nums2) {
            union.add(num);
        }

        System.out.println(union);
    }
}
