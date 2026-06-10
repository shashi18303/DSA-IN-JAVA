package A;

public class Maximumdiff {
	public static void main(String[] args) {

        int nums[] = {7, 1, 5, 4};
        int n = nums.length;

        int max = -1; // store maximum difference

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] < nums[j]) {

                    int diff = nums[j] - nums[i];

                    if (diff > max) {
                        max = diff;
                    }
                }
            }
        }

        System.out.println("Maximum Difference: " + max);
    }
}

