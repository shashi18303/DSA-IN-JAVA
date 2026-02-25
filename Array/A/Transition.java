package A;

public class Transition {
	public static void main(String[] args) {
		int arr[]= {0,0,0,1,1};
		 int index = firstOne(arr);
	        System.out.println(index);
	    }
	   static int firstOne(int[] arr) {
		for( int i=0;i<arr.length;i++){
			if(arr[i]==1) {
				return i;
			}
			
		}
		return -1;
	}

}
