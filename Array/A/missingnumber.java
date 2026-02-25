package A;

public class missingnumber {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5};
		int sum=0;
		int n=4;
		for(int i=0;i<4;i++) {
			sum +=arr[i];
		}
		int total=(n+1)*(n+2)/2;
	 System.out.println(total-sum);
	}

}