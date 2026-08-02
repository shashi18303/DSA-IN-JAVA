package A;

public class eveee {
	public static void main(String[] args) {
		int n=4;
		int d=12;
		int fine=200;
		int sum=0;
		int arr[]= {5,2,3,7};
		for(int i=0;i<4;i++) {
			if(d%2==0 && arr[i]%2!=0) {
				sum=sum+fine;
			}
		}
		System.out.println(sum);
	}

}
