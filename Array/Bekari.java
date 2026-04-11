package A;

import java.util.Scanner;

public class Bekari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int maxLeft = -1;
        int answer = 0;

        for(int k = 1; k <= N; k++) {
            int leftover = N % k;

            if(leftover > maxLeft){
                maxLeft = leftover;
                answer++;
            }
        }

        System.out.println(answer);
    }
}