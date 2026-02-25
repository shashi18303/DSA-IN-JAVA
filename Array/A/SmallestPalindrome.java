package A;

public class SmallestPalindrome {
	public static void main(String[] args) {

        int[] num = {9,4,1,8,7,9,7,8,3,2,2};
        int n = num.length;

        // Step 1: Mirror left to right
        for (int i = 0; i < n / 2; i++)
            num[n - 1 - i] = num[i];

        // Step 2: Add 1 to middle
        int carry = 1;
        int mid = (n - 1) / 2;

        while (mid >= 0 && carry > 0) {
            num[mid] += carry;
            carry = num[mid] / 10;
            num[mid] %= 10;
            num[n - 1 - mid] = num[mid];
            mid--;
        }

        // Print result
        for (int x : num)
            System.out.print(x + " ");
    }
}