package 第七章;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 全排列_中 {

	public static void main(String[] args) {
		f(new char[] {'a','b','a'},0);
		System.out.println(set);

	}
	static Set<String>set=new HashSet<>();
	public  static void f(char[]arr,int k) {

		if(k==arr.length) {
			set.add(new String(arr));
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
