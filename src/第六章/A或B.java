package 第六章;

import java.util.Scanner;

public class A或B {

	/**
	 * 题目：要求(A/B)%9973,但是由于A很大，我们只能给出n(n=A%9973)
	 * (我们给定的A必能被B整除，且gcd(B,9973)=1).
	 * 
	 * 输入：
	 * 数据的第一行是一个T，表示有T组数据
	 * 每组数据有两个数n(0<=n<9973)和B(1<=B<=10^9)
	 * 输出：
	 * 对应每组数据输出(A/B)%9973
	 */
	/**
	 * (A/B)%9973≠A%9973/B%9973
	 * 而是A*1/B%9973,此时可以交换
	 * 则A%9973*1/B(B的逆元)
	 * 
	 * 转换成一般式：n(n=A%9973)*x(B的逆元)
	 * 
	 */
	/**
	 * 同余方程ax≡1(mod n),gcd(a,n)=1时有解，意思是，a和n互素
	 * 这时称求出的x为a的对模n的乘法逆元
	 * 对于同余方程ax≡1(mod n),gcd(a,n)=1的求解就是求解方程
	 * ax+ny=1，x,y为整数。这个可以用扩展欧几里得算法求出，原同余方程的
	 * 唯一解就是用扩展欧几里得算法得出的x
	 */
	static long x;
	static long y;
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		long T=input.nextLong();
		for(int i=0;i<T;i++) {
			long n=input.nextLong();
			long B=input.nextLong();
			try {
				inverseElement(B, 9973);
				System.out.println(x*n%9973);//题目结果肯定不会超过9973,所以需要再%9973，把多余部分消掉
			} catch (Exception e) {
				System.out.println("无解");
			}
		}
		
		

	}
	//求B关于9973的逆元(就是倒数)
	public static long inverseElement(long a,long mo) throws Exception {
		long d =linerException(a, mo, 1);
		x=(x%mo+mo)%mo;
		return d;
		
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
	public static long linerException(long a,long b,long m) throws Exception {
		long d=ext_gcd(a, b);
		if(m%d!=0)throw new Exception("无解");
		long n=m/d;
		x*=n;
		y*=n;
		return d;
	}
	

}
