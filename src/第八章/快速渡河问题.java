package 第八章;

import java.util.Arrays;
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
			for(int j=0;j<n;j++) {
				speed[j]=sc.nextInt();
			}
			Arrays.sort(speed);
			f(n,speed);
		}
	}
	private static void f(int n,int[]speed) {
		int left=n;
		int ans=0;
		while(left>0) {
			if(left==1) {
				ans+=speed[0];
				break;
			}else if(left==2) {
				ans+=speed[1];
				break;
			}else if(left==3) {
				ans+=speed[2]+speed[0]+speed[1];
				break;
			}else {
				int s1=speed[1]+speed[0]+speed[left-1]+speed[1];
				int s2=speed[left-1]+speed[left-2]+2*speed[0];
				ans+=min(s1,s2);
				left-=2;
			}
		}
		System.out.println(ans);
	}
	static int min(int i,int j) {
		return i<j?i:j;
	}

}
