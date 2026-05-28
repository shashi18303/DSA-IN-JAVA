package A;

public class AverageSalary {
	public static void main(String[] args) {
		int salary[] = {1000,2000,3000};
		int n=salary.length;
		int e=n-2;
		int sum=0;
		int max=salary[0];
		int min=salary[0];
		for(int i=0;i<n;i++) {
			sum+=salary[i];
		}
		for(int i=0;i<n;i++) {
			
			if(salary[i]<max) {
				max=salary[i];
				
			}
			if(salary[i]>min) {
				min=salary[i];
				
			}
			
		}
		int re=min+max;
		int result=sum-re;
		int r=result/e;
		System.out.println(r);
	}

}
