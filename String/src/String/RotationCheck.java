package String;

import java.util.Scanner;

public class RotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = sc.nextLine();

        // Step 1: If lengths are not equal → cannot be rotation
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }

        // Step 2: Check rotation using concatenation
        String temp = s1 + s1;

        if (temp.contains(s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
