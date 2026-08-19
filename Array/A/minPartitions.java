package A;

import java.util.Scanner;

public class minPartitions {
	
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        String n = sc.next();   // input string
	        
	        int maxDigit = 0;
	        
	        for (int i = 0; i < n.length(); i++) {
	            int digit = n.charAt(i) - '0';
	            if (digit > maxDigit) {
	                maxDigit = digit;
	            }
	            
	            if (maxDigit == 9) {   // optional optimization
	                break;
	            }
	        }
	        
	        System.out.println(maxDigit);
	    }
	}