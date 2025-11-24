package Array;
import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // size of array
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();         // array input
        }

        int target = sc.nextInt();         // target sum
        
        int left = 0, sum = 0;

        for(int right = 0; right < n; right++){
            sum += arr[right];             // expand window
            
            while(sum > target && left <= right){
                sum -= arr[left];          // shrink window
                left++;
            }

            if(sum == target){
                System.out.println((left+1) + " " + (right+1));
                return;
            }
        }

        System.out.println(-1);
    }
}
