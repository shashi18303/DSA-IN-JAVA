package String;

import java.util.*;

public class MergeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S1 = sc.next();
        String S2 = sc.next();

        System.out.println(mergeAlternate(S1, S2));
    }

    public static String mergeAlternate(String S1, String S2) {
        StringBuilder result = new StringBuilder();
        
        int i = 0, j = 0;

        // Merge alternately while both strings have characters
        while (i < S1.length() && j < S2.length()) {
            result.append(S1.charAt(i));
            result.append(S2.charAt(j));
            i++;
            j++;
        }

        // Add leftover characters
        if (i < S1.length()) {
            result.append(S1.substring(i));
        }
        if (j < S2.length()) {
            result.append(S2.substring(j));
        }

        return result.toString();
    }
}

