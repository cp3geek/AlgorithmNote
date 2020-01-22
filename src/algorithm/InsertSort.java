package algorithm;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[]arr= {2,6,9,8,7,1,2,4,5};
		insertSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
	
	
	static void insertSort(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			int target=arr[i];
			int j=i-1;
			while(j>-1&&arr[j]>target) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=target;
		}
	}

}
