package algorithm;

import java.util.Arrays;

public class 调整数组顺序使得奇数位于偶数前面 {

	/**
	 * 输入一个整数数组，调整数组中数字得顺序，使得所有奇数位于数组得前半部分
	 * 所有偶数位于数组得后半部分，时间复杂度为o（n）
	 * 
	 */
	public static void main(String[] args) {
		int[] a= {1,4,2,3,5,8,7,2,1,2,5,6,7,8,10,30};
		f(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));

	}
	
	static void f(int[]arr,int p,int r) {
		int begin=p;
		int last=r;
		while(begin<=last) {
			while(begin<=last&&(arr[begin]%2)!=0)begin++;
			while(begin<=last&&(arr[last]%2)==0)last--;
			if(begin<last)swap(arr, begin, last);
		}
		
		
		
	}
	
	static int[] swap(int[]arr,int i,int j) {
		int k=arr[i];arr[i]=arr[j];arr[j]=k;
		return arr;
	}

}
