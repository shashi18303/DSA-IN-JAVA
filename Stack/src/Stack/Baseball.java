package Stack;

import java.util.*;

public class Baseball{
    public static int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                st.pop();                    // remove last score
            } 
            else if (op.equals("D")) {
                st.push(st.peek() * 2);      // double last score
            } 
            else if (op.equals("+")) {
                int a = st.pop();            // last score
                int b = st.peek();           // second last
                st.push(a);                  // put back last
                st.push(a + b);              // sum of last two
            } 
            else {
                st.push(Integer.parseInt(op)); // normal number
            }
        }

        int sum = 0;
        for (int x : st) sum += x;
        return sum;
    }

    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));   // Output: 30
    }
}

