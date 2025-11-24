package String;

import java.util.*;

public class Parentheses {
    public static boolean isBalanced(String s) {
    	  Stack st = new Stack();

        for (char ch : s.toCharArray()) {

            // Push all opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                ((Object) st).push(ch);
            }

            // Process closing brackets
            else {
                if (((CharSequence) st).isEmpty()) return false;  // no matching opening

                char top = ((Object) st).pop();

                // check correct pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack empty → all matched
        return ((CharSequence) st).isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(isBalanced(s));  // true
    }
}
