package Array;

import java.util.Scanner;

public class MissingNumber {
	public class FindMissingAndDuplicat {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size n: ");
	        int n = sc.nextInt();

	        int arr[] = new int[n];
	        System.out.println("Enter " + n + " numbers from 1 to " + n + ":");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

}
}
}