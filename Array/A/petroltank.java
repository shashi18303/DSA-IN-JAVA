package A;

public class petroltank {
	

	    public static void main(String[] args) {

	        int gas[] = {1,2,3,4,5};
	        int cost[] = {3,4,5,1,2};

	        int tank = 0;
	        int start = 0;
	        int total = 0;

	        for (int i = 0; i < gas.length; i++) {

	            tank = tank + gas[i] - cost[i];

	            // if petrol finished
	            if (tank < 0) {

	                total = total + tank;
	                start = i + 1;
	                tank = 0;
	            }
	        }

	        if (tank + total >= 0) {
	            System.out.println(start);
	        } else {
	            System.out.println(-1);
	        }
	    }
	}
