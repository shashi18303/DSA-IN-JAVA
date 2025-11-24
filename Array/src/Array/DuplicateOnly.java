package Array;

public class DuplicateOnly {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 2, 5};
        int duplicate = -1;

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                duplicate = Math.abs(arr[i]);
                break;
            }
            arr[index] = -arr[index];
        }

        System.out.println("Duplicate: " + duplicate);
    }
}
