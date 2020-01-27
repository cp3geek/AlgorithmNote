package algorithm;

import java.util.Arrays;

public class 第k小得数 {
/**
 * 
 * 以尽量高的效率求出一个乱序数组中按数值顺序的第k个元素
 */
	public static void main(String[] args) {
		int[]arr= {1,5,6,3,2,1,4,8,10,6,9};
		System.out.println(selectk(arr, 0, arr.length-1, 5));

	}
	
	static int selectk(int[]arr,int p,int r,int k){
		
			int q=partition(arr,p,r);
			int qk=q-p+1;//p在动态改变，所以qk也是在改变的
			if(qk==k)return arr[q];//返回的是第k小的数，而不是下标
			else if(qk>k)return selectk(arr, p, q-1, k);
			else return selectk(arr, q+1, r, k-qk);//k-qk代表在右边时候，位于右边数组的第几个数
		//切分的时候将数组拆开了，所以在右边的时候，下标有所改变
		
	}
	
	static void quicksort(int[]arr,int p,int r) {
		if(p<r) {
			int q=partition(arr,p,r);
			quicksort(arr, p, q-1);
			quicksort(arr, q+1, r);
		}
	}

private static int partition(int[] arr, int p, int r) {
	int primary=arr[p];
	int left=p+1;
	int right=r;
	
	while(left<=right) {
		while(left<=right&&arr[left]<=primary)left++;
		while(left<=right&&arr[right]>=primary)right--;
		if(left<right)swap(arr,left,right);
	}
	swap(arr,p,right);
	return right;
}

private static int[] swap(int[] arr, int i, int j) {
	int k=arr[i];arr[i]=arr[j];arr[j]=k;
	return arr;
}
	

}
