package algorithm;

import java.util.Arrays;

public class 合并两个有序数组 {

	/**
	 * 给定两个排序后的数组A和B，其中A的末端有足够的缓冲空间容纳B。编写一个方法
	 * ，将B合并入A并排序
	 * 
	 */
	
	static int[]help;
	public static void main(String[] args) {
		int[]a= {7,8,9,10,11,12,13};
		int[]b= {1,2,3,4,5};
		
	merge(a,b);

	}
	static void merge(int[]a,int[]b) {
		help=new int[a.length+b.length];
		System.arraycopy(a, 0, help, 0, a.length);
		int current=help.length-1;
		int pa=a.length-1;
		int pb=b.length-1;
		
		while(pa>=0&&pb>=0) {
			if(a[pa]>b[pb])help[current--]=a[pa--];
			else help[current--]=b[pb--];
		}
		while(pb>=0)help[current--]=b[pb--];
		System.out.println(Arrays.toString(help));
	}
	

}
