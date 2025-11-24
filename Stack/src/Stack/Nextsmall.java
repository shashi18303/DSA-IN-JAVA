package Stack;

import java.util.*;

public class Nextsmall {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        int n = arr.length;

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // pop all elements >= current
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // answer = top of stack or -1
            ans[i] = st.isEmpty() ? -1 : st.peek();

            // push current element
            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}
