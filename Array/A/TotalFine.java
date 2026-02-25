package A;
public class TotalFine {

    static int calculateFine(int date, int[] car, int[] fine) {
        int total = 0;

        for (int i = 0; i < car.length; i++) {

            // If date is even and car number is odd
            if (date % 2 == 0 && car[i] % 2 != 0) {
                total += fine[i];
            }

            // If date is odd and car number is even
            if (date % 2 != 0 && car[i] % 2 == 0) {
                total += fine[i];
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int date = 12;
        int[] car = {2375, 7682, 2325, 2352};
        int[] fine = {250, 500, 350, 200};

        System.out.println(calculateFine(date, car, fine));
    }
}

