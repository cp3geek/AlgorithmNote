package algorithm;

public class 二分查找递归 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println(f(arr,0,arr.length-1,4));

	}
	
	static int f(int[]arr,int low,int high,int key) {
		int mid=low+((low+high)>>2);
		
		if(arr[mid]==key)return mid;
		else if(arr[mid]>key) return f(arr,low,mid-1,key);
		else if(arr[mid]<key) return f(arr,mid+1,high,key);
		else return -1;
	}

}
