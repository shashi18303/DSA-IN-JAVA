package A;

public class singleNumber {
	public static void main(String[] args) {

        int[] nums = {2, 2, 1};

       
        int result = singleNumber(nums);

        System.out.println("Single Number: " + result);
    }

   static int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result ^= num;   // XOR operation
        }

        return result;
    }
}