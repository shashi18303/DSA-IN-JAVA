package A;

public class issubsequence {
	public static void main(String[] args) {
		   String s = "abg";
	        String t = "ahbgdc";
	 int count=0;
	        for(int j=0;j<s.length();j++) {
	        for(int i=0;i <t.length();i++) {
	        	if(s.charAt(j)==t.charAt(i)) {
	        		count++;
	        		break;
	        	}
	        }

	        	
	        }
	        if(count==s.length()) {
	        	System.out.println("true");
	        }
	        else {
	        	System.out.println("false");
	        }
	}

}
