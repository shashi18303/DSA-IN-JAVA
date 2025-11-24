package Array;
import java.util.*;

public class Frog {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of frogs: ");
        int n = sc.nextInt();

        System.out.print("Enter number of leaves: ");
        int leaves = sc.nextInt();

        int[] frogs = new int[n];
        System.out.println("Enter strengths of frogs:");
        for (int i = 0; i < n; i++) {
            frogs[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[leaves + 1];

        for (int strength : frogs) {
            if (strength == 0) continue; // ignore invalid
            for (int j = strength; j <= leaves; j += strength) {
                visited[j] = true;
            }
        }

        int count = 0;
        for (int i = 1; i <= leaves; i++) {
            if (!visited[i]) count++;
        }

        System.out.println("Unvisited leaves: " + count);
    }
}
