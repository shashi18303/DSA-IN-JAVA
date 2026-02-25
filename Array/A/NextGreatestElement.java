package A;
import java.util.Arrays;

public class NextGreatestElement {

    static void replaceWithNextGreatest(int[] arr) {
        int maxRight = -1;

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;

            if (current > maxRight) {
                maxRight = current;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        replaceWithNextGreatest(arr);

        System.out.println(Arrays.toString(arr));
    }
}
