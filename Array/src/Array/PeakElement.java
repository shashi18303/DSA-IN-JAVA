package Array;
public class PeakElement {
    public static int findPeak(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;     // peak lies on right
            } else {
                high = mid;        // peak lies on left or at mid
            }
        }
        return low; // or high (both are same)
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        int index = findPeak(arr);
        System.out.println(index);      // peak index
    }
}
