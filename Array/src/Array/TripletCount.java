package Array;

import java.util.*;

public class TripletCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter sum: ");
        int sum = sc.nextInt();

        Arrays.sort(arr);  
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left <= right) {
                if (arr[i] + arr[left] + arr[right] < sum) {
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("Triplet count = " + count);
    }
}

