package 第七章;

import java.util.Arrays;

public class 全排列_下 {

	//刚才的方法无法维持字典序
	
	/**
	 * n个数的排列组合找出字典序第k个排列
	 * abc
	 * acb
	 * bac
	 * bca
	 * cab
	 * cba
	 * 
	 */
	final static int k=3;
	static int count=0;
	public static void main(String[] args) {
		f("",new char[] {'b','a','c'});

	}
	
	public static void f(String prefix,char[]arr) {
		Arrays.sort(arr);
		if(prefix.length()==arr.length) {
			System.out.println(prefix);
			//用set去重
			count++;
			if(count==k) {
				System.out.println("------"+prefix);
				System.exit(0);//找到第k个排列直接退出
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			if(count(prefix,ch)<count(arr,ch)) {
				f(prefix+ch,arr);
			}
		}
	}
	//处理重复
	static int count(char[]arr,char ch) {
		int cnt=0;
		for(char c:arr) {
			if(c==ch) cnt++;
		}
		return cnt;
	}
	static int count(String prefix,char ch) {
		int cnt=0;
		for(int i=0;i<prefix.length();i++) {
			if(prefix.charAt(i)==ch)cnt++;
		}
		return cnt;
	}

}
