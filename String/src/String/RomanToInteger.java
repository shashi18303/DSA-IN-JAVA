package String;
import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Number: ");
        String s = sc.next();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if (current < next) {
                result -= current;     // subtractive rule
            } else {
                result += current;     // additive rule
            }
        }

        // Add last character always
        result += map.get(s.charAt(s.length() - 1));

        System.out.println("Integer value: " + result);
    }
}
