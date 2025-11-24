package Array;
import java.util.*;

public class TransitionPoint {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 0, 0};

     

        System.out.println(  firstOneIndex(arr));
    }

    public static int firstOneIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;   // return 0-based index
            }
        }
        return -1;  // no 1 found
    }
}
