package A;

import java.util.HashMap;

public class PrimeFrequency {
	public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        // Check prime frequency
        for (int freq : map.values()) {

            if (freq < 2) continue;   // 0 or 1 not prime

            boolean prime = true;

            for (int i = 2; i <= freq / 2; i++) {
                if (freq % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}