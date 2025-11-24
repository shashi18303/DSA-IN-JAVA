package String;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

       

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams (different lengths)");
        } else {
            // Convert to char array
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Sort the arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare the sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are anagrams!");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        scanner.close();
    }
}

