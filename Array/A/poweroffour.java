package A;

public class poweroffour {

	 public static boolean isPowerOfFour(int n) {

	        // Step 1: Handle numbers <= 0
	        if (n <= 0) return false;

	        // Step 2: Keep dividing by 4
	        while (n % 4 == 0) {
	            n = n / 4;
	        }

	        // Step 3: Check if the result is 1
	        return n == 1;
	    }

	    public static void main(String[] args) {
	        System.out.println(isPowerOfFour(16)); // true
	        System.out.println(isPowerOfFour(5));  // false
	        System.out.println(isPowerOfFour(1));  // true
	        System.out.println(isPowerOfFour(64)); // true
	        System.out.println(isPowerOfFour(20)); // false
	    }
	}