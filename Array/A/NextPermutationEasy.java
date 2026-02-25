package A;

import java.util.Arrays;

public class NextPermutationEasy {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int n = nums.length;

        // Case 1: If last number is bigger than previous
        if (nums[n - 1] > nums[n - 2]) {
            int temp = nums[n - 1];
            nums[n - 1] = nums[n - 2];
            nums[n - 2] = temp;
        } 
        else {
            // Case 2: Reverse whole array
            for (int i = 0; i < n / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[n - 1 - i];
                nums[n - 1 - i] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

