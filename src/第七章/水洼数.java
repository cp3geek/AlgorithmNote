package 第七章;

import java.util.Scanner;

public class 水洼数 {

	/**
	 * 有一个大小为N*M的园子,雨后积起了水,八连通的积水被认为是连在一起的
	 * 。请求出园子里总共有多少水洼？(八连通指的是下图中相对W的*部分)
	 * 
	 * ***
	 * *W*
	 * ***
	 * 限制条件
	 * N,M<=100
	 * 样例
	 * 输入
	 * N=10,M=12;
	 * 园子如下图(W表示积水,.表示没有)
	 * 
W........WW.
.WWW.....WWW
....WW...WW.
.........WW.
.........W..
..W......W..
.W.W.....WW.
W.W.W.....W.
.W.W......W.
..W.......W.
	 * 
	 * 输出
	 * 3
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 m=sc.nextInt();
		char[][]a=new char[n][];
		for(int i=0;i<n;i++) {
			a[i]=sc.next().toCharArray();
		}
		int count=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i][j]=='W') {
					dfs(a,i,j);
					count++;
				}
			}
		}
		System.out.println(count);

	}
	static int n;
	static int m;

	private static void dfs(char[][] a, int i, int j) {
		a[i][j]='.';
//		for(int k=-1;k<2;k++) {//八个方向走其实就是坐标+1，-1，0不动
//			for(int l=-1;l<2;l++) {
//				if(k==0&&l==0)continue;
//				
//				if(i+k>=0&&i+k<=n-1&&j+l>=0&&j+l<=m-1) {
//					if(a[i+k][j+l]=='W')
//						dfs(a,i+k,j+l);
//				}
//			}
//		}
		for(int k=-1;k<2;k++) {
			for(int l=-1;l<2;l++) {
				if(k==0&&l==0)continue;
				
				if(i+k>=0&&i+k<=a.length-1&&j+l>=0&&j+l<=a[0].length-1) {
					if(a[i+k][j+l]=='W') {
						dfs(a,i+k,j+l);
					}
				}
				
			}
		}
		
	}
	/**
	 * if(i>0&&a[i-1][j]=='W')dfs(a,i-1,j);//上
		if(i<a.length-1&&a[i+1][j]=='W')dfs(a,i+1,j);//下
		if(j<a[0].length-1&&a[i][j+1]=='W')dfs(a,i,j+1);//右
		if(j>0&&a[i][j-1]=='W')dfs(a,i,j-1);//左
		if(i>0&&j>0&&a[i-1][j-1]=='W')dfs(a,i-1,j-1);//左上角
		if(j<a[0].length-1&&i>0&&a[i-1][j+1]=='W')dfs(a,i-1,j+1);//右上角
		if(j>0&&i<a.length-1&&a[i+1][j-1]=='W')dfs(a,i+1,j-1);//左下角
		if(j<a[0].length-1&&i<a.length-1&&a[i+1][j+1]=='W')dfs(a,i+1,j+1);//右下角
	 */

}
