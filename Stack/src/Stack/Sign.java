package Stack;
import java.util.*;

public class Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (!st.isEmpty() && (st.peek() < 0 && x >= 0 || st.peek() >= 0 && x < 0))
                st.pop();          // remove opposite sign pair
            else
                st.push(x);        // keep number
        }

        for (int num : st) System.out.print(num + " ");
    }
}
