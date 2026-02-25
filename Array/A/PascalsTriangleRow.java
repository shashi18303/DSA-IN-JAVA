package A;

import java.util.*;

public class PascalsTriangleRow {

    public static void main(String[] args) {
        int rowIndex = 3;

        List<Integer> result = getRow(rowIndex);

        System.out.println(result);
    }

    static List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {

            row.add(1);  // add 1 at end

            // update values from back
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}
