package String;
import java.util.Scanner;

public class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int[] freq = new int[26]; // for 'a' to 'z'

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Find max occurring character
        char result = 'a';
        int maxCount = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                result = (char) (i + 'a');
            }
        }

        System.out.println("Maximum occurring character: " + result);
    }
}
