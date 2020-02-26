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
		int[]rec=new int[n];
		rec[0]=1;
		dfs(n,rec,1);

	}

	private static void dfs(int n, int[] rec, int cur) {
		
		if(cur==n&&isp(rec[0]+rec[n-1])) {
			print(rec);
			return;
		}
		for(int i=2;i<=n;i++) {
			if(check(rec,i,cur)) {
				rec[cur]=i;
				dfs(n,rec,cur+1);
				rec[cur]=0;
			}
		}
		
	}

	private static boolean check(int[] rec, int i,int cur) {
		for(int e:rec) {
			if(e==i||!isp(rec[cur-1]+i))return false;
		}
		return true;
	}

	private static void print(int[] rec) {
		for(int i=0;i<rec.length;i++) {
			System.out.print(rec[i]+(i==rec.length-1?"":" "));
		}
		System.out.println();
		
	}

	private static boolean isp(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}

}
