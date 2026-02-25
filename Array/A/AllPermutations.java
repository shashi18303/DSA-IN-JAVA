package A;

import java.util.*;

public class AllPermutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums, 0);
    }

    static void permute(int[] nums, int index) {

        // If index reaches end → print permutation
        if (index == nums.length) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for (int i = index; i < nums.length; i++) {

            // Swap
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            // Recursive call
            permute(nums, index + 1);

            // Swap back (Backtracking)
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}
