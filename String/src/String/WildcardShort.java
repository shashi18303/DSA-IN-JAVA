package String;

import java.util.*;

public class WildcardShort {

    static boolean match(String w, String p, int i, int j) {
        if (i == w.length() && j == p.length()) return true;
        if (i == w.length()) return false;

        if (w.charAt(i) == '*') {
            // * → match zero char OR match one char
            return (j < p.length() && match(w, p, i, j + 1)) || match(w, p, i + 1, j);
        }

        if (j < p.length() &&
            (w.charAt(i) == p.charAt(j) || w.charAt(i) == '?')) {
            return match(w, p, i + 1, j + 1);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wild = sc.nextLine();
        String pattern = sc.nextLine();

        System.out.println(match(wild, pattern, 0, 0) ? "Yes" : "No");
    }
}

