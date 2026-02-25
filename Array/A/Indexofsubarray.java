package A;


public class Indexofsubarray {

    public static void main(String[] args) {
    	  
    	        int[] arr = {1, 2, 3, 7, 5};
    	        int target = 12;

    	        for (int i = 0; i < arr.length; i++) {

    	            int sum = 0;

    	            for (int j = i; j < arr.length; j++) {

    	                sum = sum + arr[j];

    	                if (sum == target) {
    	                    System.out.println("Start Index: " + i);
    	                    System.out.println("End Index: " + j);
    	                    return;   // stop program
    	                }
    	            }
    	        }

    	        System.out.println("No subarray found");
    	    }
    	}