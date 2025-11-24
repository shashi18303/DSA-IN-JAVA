package Array;

import java.util.*;

public class TotalFine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date: ");
        int date = sc.nextInt();

        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();

        int[] car = new int[n];
        int[] fine = new int[n];

        System.out.println("Enter " + n + " car numbers:");
        for (int i = 0; i < n; i++) {
            car[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " fines:");
        for (int i = 0; i < n; i++) {
            fine[i] = sc.nextInt();
        }

        int totalFine = 0;

        for (int i = 0; i < n; i++) {

            // date even → collect fine from odd cars
            if (date % 2 == 0 && car[i] % 2 != 0) {
                totalFine += fine[i];
            }
            // date odd → collect fine from even cars
            else if (date % 2 != 0 && car[i] % 2 == 0) {
                totalFine += fine[i];
            }
        }

        System.out.println("Total Fine = " + totalFine);
    }
}

