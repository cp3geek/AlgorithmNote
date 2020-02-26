package 第七章;

import java.util.Scanner;

public class 素数环 {

	/**
	 * 输入正整数n，对1-n进行排列，使得相邻两个数之和均为素数
	 * 输出时从整数1开始，逆时针排列。同一个环应该恰好输出一次
	 * n<=16
	 * 输入：6
	 * 输出
	 * 1 4 3 2 5 6
	 * 1 6 5 2 3 4
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]r=new int[n];
		r[0]=1;
		dfs(n,r,1);

	}

	private static void dfs(int n, int[] r, int cur) {
		
		if(cur==n&&isp(r[0]+r[n-1])) {
			print(r);
			return;
		}
		for(int i=2;i<=n;i++) {
			if(check(r,i,cur)) {
				r[cur]=i;
				dfs(n,r,cur+1);
				r[cur]=0;//此题必须回溯，因为check在检查的时候
				//会扫描一遍数组，如果不回溯则上一个位置可选择填的数就少了一个
			}
		}
		
	}

	private static boolean check(int[] r, int i, int cur) {
		for(int k=0;k<r.length;k++) {
			if(r[k]==i||!isp(r[cur-1]+i))return false;
		}
		return true;
	}

	private static void print(int[] r) {
		for(int i=0;i<r.length;i++) {
			System.out.print(r[i]+(i==r.length-1?"":" "));
		}
		System.out.println();
	}

	private static boolean isp(int num) {
		if(num<=2)return false;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0)return false;
		}
		return true;
	}
	

		

}
