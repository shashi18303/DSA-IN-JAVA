package A;
public class FirstLastPosition {

    static int[] searchRange(int nums[], int target) {

        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                if (first == -1)
                    first = i;

                last = i;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {

        int nums[] = {5,8,7,6,8,2,8};
        int target = 8;

        int result[] = searchRange(nums, target);

        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}