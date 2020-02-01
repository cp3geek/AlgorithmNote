package algorithm;

import java.util.Arrays;

public class 超过一半得数字 {
	/**
	 * 
	 * 数组中有一个数字出现得次数超过了数组长度得一半，找出这个数字
	 * 可以用快排得思想，也可以排序后找第n/2个数
	 */

	public static void main(String[] args) {
		int[]arr= {5,2,1,3,2,1,1,1,4,1,1};
		System.out.println(solve1(arr));
		System.out.println(solve2(arr));
	}
	
	static int solve1(int[]arr) {
		Arrays.sort(arr);
		return arr[(arr.length)/2];
		
	}
	
	//不允许修改数组
	static int solve2(int[]arr) {
		int res=第k小得数.selectk(arr, 0, arr.length-1, arr.length/2);
		return res;
	}

}
