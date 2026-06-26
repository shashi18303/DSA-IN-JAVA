package A;

public class calender {
	 public static void main(String[] args) {

	        String day = "mon"; // starting day
	        int n = 13;         // number of days

	        int d = 0;

	        if(day.equals("sun")) d = 0;
	        else if(day.equals("mon")) d = 1;
	        else if(day.equals("tue")) d = 2;
	        else if(day.equals("wed")) d = 3;
	        else if(day.equals("thu")) d = 4;
	        else if(day.equals("fri")) d = 5;
	        else if(day.equals("sat")) d = 6;

	        int count = 0;

	        for(int i = 0; i <= n; i++) {
	            if((d + i) % 7 == 0) { // check Sunday
	                count++;
	            }
	        }

	        System.out.println(count);
	    }
	}