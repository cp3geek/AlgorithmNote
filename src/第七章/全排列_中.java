package 第七章;

public class 全排列_中 {

	public static void main(String[] args) {
		f(new char[] {'a','b','c'},0);

	}
	
	public  static void f(char[]arr,int k) {
		
		if(k==arr.length) {
			System.out.println(new String(arr));
		}
		
		for(int i=k;i<arr.length;i++) {
			swap(arr,i,k);//交换每一位到第一位
			f(arr,k+1);
			swap(arr,i,k);//回溯
		}
	}
	
	public static void swap(char[]arr,int i,int j) {
		char c=arr[i];
		arr[i]=arr[j];
		arr[j]=c;
	}

}
