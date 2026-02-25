package A;
public class TeemoAttacking {

    public static void main(String[] args) {

        int[] timeSeries = {1, 2};
        int duration = 2;

        int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {

            int gap = timeSeries[i + 1] - timeSeries[i];

            if (gap >= duration) {
                total += duration;   // no overlap
            } else {
                total += gap;        // overlap case
            }
        }

        // Add duration for last attack
        total += duration;

        System.out.println("Total Poisoned Time: " + total);
    }
}
