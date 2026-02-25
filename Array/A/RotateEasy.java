package A;
import java.util.Arrays;

public class RotateEasy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // rotate by 2
        for (int r = 0; r < 2; r++) {
            int last = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));
    }
}
