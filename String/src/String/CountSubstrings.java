package String;

import java.util.Scanner;

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.nextLine();

        int countOne = 0;

        // Count number of '1's
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                countOne++;
            }
        }

        // Apply formula: countOne choose 2 = countOne * (countOne - 1) / 2
        int result = (countOne * (countOne - 1)) / 2;

        System.out.println("Number of substrings: " + result);
    }
}
