package A;

import java.util.*;

class  minPatches {

     static int minPatches(int[] nums, int n) {

        long miss = 1;
        int i = 0;
        int patches = 0;

        while (miss <= n) {

            if (i < nums.length && nums[i] <= miss) {
                miss = miss + nums[i];
                i++;
            } else {
                miss = miss + miss;
                patches++;
            }
        }
        return patches;
    }

    public static void main(String[] args) {

        

        int[] nums = {1, 3};
        int n = 6;

        int result = minPatches(nums, n);

        System.out.println("Minimum patches required: " + result);
    }
}
