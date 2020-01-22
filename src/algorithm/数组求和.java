package algorithm;

public class 数组求和 {

	public static void main(String[] args) {
		int[] arr= {1,2};
		System.out.println(f(arr,0));

	}
	//递归
	static int f(int[]arr,int i) {
		if(i==arr.length)return 0;
		return arr[i]+f(arr,i+1);
	}

}
