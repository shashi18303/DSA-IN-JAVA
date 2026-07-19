package A;

public class Bills {
    public static void main(String[] args) {

        int bills[] = {5, 5, 5, 10, 20};

        int five = 0;
        int ten = 0;

        boolean possible = true;

        for (int i = 0; i < bills.length; i++) {

            // Customer gives 5
            if (bills[i] == 5) {
                five++;
            }

            // Customer gives 10
            else if (bills[i] == 10) {

                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    possible = false;
                    break;
                }
            }

            // Customer gives 20
            else {

                // Give 10 + 5
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                }

                // Give 5 + 5 + 5
                else if (five >= 3) {
                    five = five - 3;
                }

                else {
                    possible = false;
                    break;
                }
            }
        }

        System.out.println(possible);
    }
}