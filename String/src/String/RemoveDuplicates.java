package String;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "geEksforGEeks";

        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
