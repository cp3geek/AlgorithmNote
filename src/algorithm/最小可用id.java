package algorithm;

import java.util.Arrays;

public class 最小可用id {

	/**
	 * 在非负数组（乱序）中找到最小的可分配的id（从1开始编号），数据量为1000000
	 * 
	 */
	public static void main(String[] args) {
		int[]arr= {5,1,3,6,2,7,8};
		//1,2,3,5,6,7,8
		System.out.println(f(arr));

	}
	//填坑法NlogN
	static int f(int[]arr) {
		Arrays.sort(arr);
		int res=1;
		for(int i=0;i<arr.length;i++) {
			if((i+1)!=arr[i]) {
				res=i+1;
				break;
			}
		}
		return res;
	}
	//开辟辅助空间，注意数组，如果大于数组长度的数就不用管了，剩空间

	
	
	//如果不能用辅助空间还可以用快排的分区思想
}
