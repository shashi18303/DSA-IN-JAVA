package A;

import java.util.HashMap;

public class Count {
    public static void main(String[] args) {

        String s = "aaabbbccdddde";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxGroup = 0;
        String result = "";

        // Check each frequency group
        for (int count : map.values()) {

            String temp = "";

            for (char ch : map.keySet()) {
                if (map.get(ch) == count) {
                    temp += ch;
                }
            }

            // Store largest group
            if (temp.length() > maxGroup) {
                maxGroup = temp.length();
                result = temp;
            }
        }

        System.out.println(result);
    }
}