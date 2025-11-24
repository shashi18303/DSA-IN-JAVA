package Stack;
import java.util.*;

public class Remaingwords{
    public static int remainingWords(String[] arr) {
        Stack<String> st = new Stack<>();

        for (String word : arr) {
            if (!st.isEmpty() && st.peek().equals(word)) {
                st.pop();  // destroy pair
            } else {
                st.push(word);
            }
        }

        return st.size();
    }

    public static void main(String[] args) {
        String[] arr = {"ab", "aa", "aa", "bcd", "ab"};
        System.out.println(remainingWords(arr)); // Output: 3
    }
}

