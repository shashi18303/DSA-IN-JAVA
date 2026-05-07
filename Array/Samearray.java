package A;
import java.util.*;

public class Samearray {
    public static void main(String[] args) {

        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        int[] count = new int[1001];

        // Count frequency of arr1 elements
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }

        int index = 0;

        // Arrange elements according to arr2
        for (int i = 0; i < arr2.length; i++) {
            while (count[arr2[i]] > 0) {
                arr1[index] = arr2[i];
                index++;
                count[arr2[i]]--;
            }
        }

        // Place remaining elements in ascending order
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr1[index] = i;
                index++;
                count[i]--;
            }
        }

        // Print result
        System.out.println(Arrays.toString(arr1));
    }
}