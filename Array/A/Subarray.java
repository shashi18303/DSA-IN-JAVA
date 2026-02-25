package A;

public class Subarray{
	
	static int sum(int arr[],int target) {
		
		for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == target) {
                    System.out.println("[" + (i + 1) + ", " + (j + 1) + "]");
                    return i + 1; 
                }
            }
		}
            
		  return -1;
	}
	
	
	
	
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        System.out.println(sum(arr,target));
        }
    }

