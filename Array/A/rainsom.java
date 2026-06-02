package A;

public class rainsom {
	 public static void main(String[] args) {

	        int arr[] = {0,2,1,-6,6,-7,9,1,2,0,1};

	        int sum = 0;

	        // Find total sum
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }

	        // Check divisible by 3
	        if (sum % 3 != 0) {
	            System.out.println(false);
	            return;
	        }

	        int target = sum / 3;
	        int currentSum = 0;
	        int count = 0;

	        // Find partitions
	        for (int i = 0; i < arr.length; i++) {

	            currentSum += arr[i];

	            if (currentSum == target) {
	                count++;
	                currentSum = 0;
	            }
	        }

	        if (count >= 3) {
	            System.out.println(true);
	        } else {
	            System.out.println(false);
	        }
	    }
	}
