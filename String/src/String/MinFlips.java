package String;

public class MinFlips {
    public static void main(String[] args) {

        String s = "0001010111";

        int flipsStartWith0 = 0;
        int flipsStartWith1 = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected0 = (i % 2 == 0) ? '0' : '1';  // pattern: 010101...
            char expected1 = (i % 2 == 0) ? '1' : '0';  // pattern: 101010...

            if (s.charAt(i) != expected0) flipsStartWith0++;
            if (s.charAt(i) != expected1) flipsStartWith1++;
        }

        int result = Math.min(flipsStartWith0, flipsStartWith1);
        System.out.println("Minimum flips: " + result);
    }
}
