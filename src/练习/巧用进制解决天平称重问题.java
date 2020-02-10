package 练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 巧用进制解决天平称重问题 {

	/**
	 * 用天平称重时候，我们希望用尽可能少的砝码组合称出尽可能多的重量
	 * 如果有无限个砝码，但是他们的重量分别是1，3，9，27，81...等3的指数幂
	 * 神奇之处在于用它们组合可以称出任意整数重量（砝码允许放在左右两个盘子中）
	 * 本题目要求：对用户给定的重量，给出砝码组合方案，重量小于1000000
	 * 例如：
	 * 用户输入：
	 * 5 
	 * 输出：
	 * 9-3-1
	 * 
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		String x=Integer.toString(N,3);
		
		char[]arr=new StringBuilder(x).reverse().toString().toCharArray();
		
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='2') {
				list.add(0,-1);
				if(i==arr.length-1) {
					list.add(0,1);
				}else {
					++arr[i+1];
				}
			}else if(arr[i]=='3') {
				list.add(0,-1);
				if(i==arr.length-1) {
					list.add(0,1);
				}else {
					++arr[i+1];
				}
			}else {
				list.add(0,arr[i]-'0');
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==1)sb.append("+").append((int)Math.pow(3, list.size()-i-1));
			if(list.get(i)==-1)sb.append("-").append((int)Math.pow(3, list.size()-i-1));
		}
		System.out.println(sb.substring(1));

	}

}
