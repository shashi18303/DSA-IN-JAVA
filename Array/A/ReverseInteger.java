package A;

public class ReverseInteger {
    public static int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // Check overflow
        
            rev = rev * 10 + pop;
        }

        return rev;
    }

    public static void main(String[] args) {
        // 321
        System.out.println(reverse(-123));  // -321
          // 21
    }
}