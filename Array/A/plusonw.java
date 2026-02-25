package A;


public class plusonw {

    public static void main(String[] args) {

        int[] digits = {1, 2, 3};

        int[] result = plusOne(digits);

        // Print result
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] < 10) {
                return digits;   // No carry needed
            }

            digits[i] = 0;   // Carry case
        }

        // If all digits were 9
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;

        return newArr;
    }
}
