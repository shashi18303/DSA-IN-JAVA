package Array;
import java.util.*;

public class rearrange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int x : arr) {
            if (x >= 0) pos.add(x);
            else neg.add(x);
        }

        int i = 0, j = 0, k = 0;

        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }

        while (i < pos.size()) arr[k++] = pos.get(i++);
        while (j < neg.size()) arr[k++] = neg.get(j++);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }
}
