package A;

import java.util.*;

public class IntersectionArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int x : a) {
            set.add(x);
        }

        for (int x : b) {
            if (set.contains(x)) {
                result.add(x);
                set.remove(x); // avoid duplicates
            }
        }

        System.out.println(result);
    }
}
