package A;
import java.util.*;

public class UnionSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 3, 5, 6};

        Set<Integer> set = new HashSet<>();

        for (int num : arr1)
            set.add(num);

        for (int num : arr2)
            set.add(num);

        System.out.println(set);
    }
}