package String;
import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        // Split on one or more dots
        String[] words = s.split("\\.+");

        // Reverse the array of words
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Join using a single dot
        return String.join(".", words);
    }
}

