package A;

import java.util.Arrays;

public class Hindex {
	 public static void main(String[] args) {

	        int[] citations = {3, 0, 6, 1, 5};

	        Arrays.sort(citations);

	        int h = 0;
	        int n = citations.length;

	        // Traverse from end (largest citation)
	        for (int i = n - 1; i >= 0; i--) {

	            if (citations[i] > h) {
	                h++;
	            }
	        }

	        System.out.println(h);
	    }
	}