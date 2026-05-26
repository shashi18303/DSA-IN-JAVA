package A;

public class coinchange {
	 public static void main(String[] args) {

	        int[] coins = {1, 2, 5};
	        int amount = 11;

	        int count = 0;

	        // Start from biggest coin
	        for (int i = coins.length - 1; i >= 0; i--) {

	            while (amount >= coins[i]) {
	                amount = amount - coins[i];
	                count++;
	            }
	        }

	        System.out.println(count);
	    }
	}