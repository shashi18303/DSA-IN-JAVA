package Stack;

import java.util.*;

public class Deletemid {

    public static void deleteMid(Stack<Integer> s, int size, int current) {

        // Base case: middle is reached
        if (current == size / 2) {
            s.pop();    // delete the middle element
            return;
        }

        int temp = s.pop();   // remove top

        deleteMid(s, size, current + 1);

        s.push(temp);         // push back after deleting middle
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        int size = s.size();
        deleteMid(s, size, 0);

        System.out.println(s);
    }
}
