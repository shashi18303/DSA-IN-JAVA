package A;

public class Boomaring {
	  public static void main(String[] args) {

	        int points[][] = {{1,1},{2,3},{3,2}};

	        int x1 = points[0][0];
	        int y1 = points[0][1];

	        int x2 = points[1][0];
	        int y2 = points[1][1];

	        int x3 = points[2][0];
	        int y3 = points[2][1];

	        if ((y2 - y1) * (x3 - x2) == 
	            (y3 - y2) * (x2 - x1)) {

	            System.out.println(false);
	        } else {
	            System.out.println(true);
	        }
	    }
	}