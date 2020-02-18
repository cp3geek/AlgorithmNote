package 第五章第六章课后题;

import java.util.Scanner;

public class 扩展欧几里得 {
	/**
	 * 小Hi和小Ho周末在公园溜达。公园有一堆围成环形的石板，
	 * 小Hi和小Ho分别站在不同的石板上。已知石板总共有m块，
	 * 编号为 0..m-1，小Hi一开始站在s1号石板上，
	 * 小Ho一开始站在s2号石板上。
小Hi：小Ho，你说我们俩如果从现在开始按照固定的间隔数同时同向移动，
我们会不会在某个时间点站在同一块石板上呢？
小Ho：我觉得可能吧，你每次移动v1块，我移动v2块，我们看能不能遇上好了。
小Hi：好啊，那我们试试呗。
一个小时过去了，然而小Hi和小Ho还是没有一次站在同一块石板上。
小Ho：不行了，这样走下去不知道什么时候才汇合。
小Hi，你有什么办法算算具体要多久才能汇合么？
小Hi：让我想想啊。。
输入
第1行：每行5个整数s1,s2,v1,v2,m，
0≤v1,v2≤m≤1,000,000,000。0≤s1,s2<m
中间过程可能很大，最好使用64位整型
输出
第1行：每行1个整数，表示解，若该组数据无解则输出-1
样例输入
0 1 1 2 6
样例输出
5
	 * 
	 */
	/**
	 * 
	 */
//(s1+v1t)-(s2+v2t)=km
	//(v1-v2)t-km=s2-s1;
	//(v2-v1)t+km=s1-s2;
	//(v1-v2)≡s2-s1(mod m)
	static long x;
	static long y;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int s1=input.nextInt();
		int s2=input.nextInt();
		int v1=input.nextInt();
		int v2=input.nextInt();
		int m1=input.nextInt();
		int a=v2-v1;
		int b=m1;
		int m=s1-s2;
		try {
			long d=liner(a, b, m);
			b/=d;
			b=Math.abs(b);
			x=(x%b+b)%b;
			System.out.println(x);
		} catch (Exception e) {
			System.out.println(-1);
		}

	}
	
	public static long ext_gcd(long a,long b) {
		if(b==0) {
			x=1;
			y=0;
			return a;
		}
		long res=ext_gcd(b,a%b);
		long x1=x;
		x=y;
		y=x1-a/b*y;
		return res;
	}
	public static long liner(long a,long b,long m) throws Exception {
		long d=ext_gcd(a, b);
		if(m%d!=0)throw new Exception("无解");
		long n=m/d;
		x*=n;
		y*=n;
		return d;
	}

}
