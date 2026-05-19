package A;

public class MoveZero {

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 3, 12};
        int j = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;   // move position forward
            }
        }

        // Fill remaining positions with 0
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }

        // Print result
        for (int x : arr)
            System.out.print(x + " ");
    }
}
