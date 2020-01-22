package algorithm;

public class 旋转数组的最小数字__改造二分法 {

	
	/**
	 * 
	 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称为数组的旋转。输入一个递增数组
	 * 排序的旋转，输出旋转数组的最小元素。例如数组{3，4，5，1，2}为{1，2，3，4，5}的一个
	 * 旋转，该数组的最小值为1
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int[] arr= {3,4,5,1,2};
		System.out.println(f(arr,0,arr.length-1));
		

	}
	static int f(int[]arr,int begin,int end) {
		
		//begin等于上一个mid，所以需要加1退出循环
		while(begin+1<end) {
			int mid=begin+((end-begin)>>1);
			if(arr[mid]>arr[begin])begin=mid;
			else end=mid;
		}
		return arr[end];
	}

}
