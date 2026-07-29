package A;

public class Monotonicarray {
	public static void main(String[] args) {
		int nums[] = {6,5,4,4};
		int count=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]<=nums[i+1]) {
				count++;
			}
			if(nums[i]>=nums[i+1]) {
				count++;
			}
		}
		if(count==nums.length) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
	}

}
