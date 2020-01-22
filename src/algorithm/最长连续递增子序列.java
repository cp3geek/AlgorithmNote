package algorithm;

public class 最长连续递增子序列 {

	
	/**
	 * 
	 * (1,9,2,5,7,3,4,6,8,0)的最长连续递增子序列是(3,4,6,8)
	 * 双指针记录
	 */
	public static void main(String[] args) {
		int[]arr= {1,9,0};
		f(arr);
	}
	static void f(int[]arr) {
		int max=0;
		int count=1;
		int begin=0;
		
	
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]<arr[i+1]) {
				if(count==1) {//记录第一个位置！！！！！！
				begin=i;}
				count++;
			}
			else {
				max=Math.max(count, max);
				
				count=1;
			}
		}
		
		max=Math.max(count, max);
//		System.out.println(max);
//		System.out.println(begin);
		for(int i=begin,j=0;j<max;i++,j++) {
			System.out.println(arr[i]);
		}
	}

}
