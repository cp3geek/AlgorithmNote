package algorithm;

public class 子数组的最大累加和 {

	
	/**
	 * 给定一个数组，返回子数组的最大累加和
	 * arr={1,-2,3,5,-2,6,-1}所有子数组中[3,5,-2,6]可以累加出最大的和12，所以返回12
	 * 
	 */
	public static void main(String[] args) {
		int[]arr= {1,-2,3,5,-2,6,-1,8};
		System.out.println(f(arr));

	}
	
	//暴力解法
	static int f(int[]arr) {
		int n=arr.length;//8
		int max=0;
		
		for(int i=0;i<n;i++) {
			int sum=arr[i];
			for(int j=i+1;j<n;j++) {
				if(sum>max)max=sum;
				sum+=arr[j];
				if(j==n-1) {
					if(sum>max)max=sum;
				}
			}
		}
		return max;
		
		
		
	}

}
