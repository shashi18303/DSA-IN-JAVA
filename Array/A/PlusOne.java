package A;
public class PlusOne {
    public static void main(String[] args) {

        int[] digits = {1, 2, 3};

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] < 10) {
                break;  // No carry needed
            }

            digits[i] = 0;  // Carry case
        }

        // Check if first digit became 0 (means all were 9)
        if (digits[0] == 0) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;

            digits = newArr;
        }

        // Print result
        for (int x : digits) {
            System.out.print(x + " ");
        }
    }
}
