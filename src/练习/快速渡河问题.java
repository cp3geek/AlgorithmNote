package 练习;

import java.util.Scanner;

public class 快速渡河问题 {

	/**
	 * 有n个人需要过河，但只要一艘船，船每次只能坐两人，每个人有不同的速度，若两个人一组的话整体划船速度又慢的人
	 * 决定，设计一种策略，用最少的时间让所有人都过河
	 * 
	 * 输入
	 * 1//一组数据
	 * 4//4个人（不超过1000）
	 * 1 2 5 10//四个人的划船速度，单位秒（不超过100）
	 * 输出
	 * 17
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int n=sc.nextInt();
			int[]speed=new int[n];
			for(int j=0;j<speed.length;j++) {
				speed[j]=sc.nextInt();
			}
			f(n,speed);
		}

	}
	public static void f(int n,int[]speed) {
		int left=n;
		int ans=0;
	}
	

}
