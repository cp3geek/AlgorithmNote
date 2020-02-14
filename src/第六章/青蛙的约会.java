package 第六章;

import java.util.Scanner;

public class 青蛙的约会 {

	/**
 两只青蛙在网上相识了，它们聊得很开心，于是觉得很有必要见一面。
 它们很高兴地发现它们住在同一条纬度线上，于是它们约定各自朝西跳，
 直到碰面为止。可是它们出发之前忘记了一件很重要的事情，既没有问清楚对方的特征，
也没有约定见面的具体位置。不过青蛙们都是很乐观的，
它们觉得只要一直朝着某个方向跳下去，总能碰到对方的。
但是除非这两只青蛙在同一时间跳到同一点上，不然是永远都不可能碰面的。
为了帮助这两只乐观的青蛙，你被要求写一个程序来判断这两只青蛙是否能够碰面，
会在什么时候碰面。
 我们把这两只青蛙分别叫做青蛙A和青蛙B，
并且规定纬度线上东经0度处为原点，由东往西为正方向，
单位长度1米，这样我们就得到了一条首尾相接的数轴。
设青蛙A的出发点坐标是x，青蛙B的出发点坐标是y。
青蛙A一次能跳m米，青蛙B一次能跳n米，两只青蛙跳一次所花费的时间相同。
纬度线总长L米。现在要你求出它们跳了几次以后才会碰面。
假设跳了t次

写成方程式:(m*t+x)-(n*t+y)=kL//k是倍数,转换车线性同余方程为：

(m-n)t≡(x-y)(mod L)
转换成一元二次方程
ax+by=m ====>(m-n)t+Ly=x-y


Input

输入只包括一行5个整数x，y，m，n，L，
其中x≠y < 2000000000，
0 < m、n < 2000000000，
0 < L < 2100000000。
Output

输出碰面所需要的跳跃次数，如果永远不可能碰面则输出一行"Impossible"
Sample Input

1 2 3 4 5
Sample Output

4
	 * 
	 */
	/**
	 * 先从数学性质上处理一直条件，本题实际就是求解同余方程：

x + mt ≡ y + nt (mod L) （其中 t 为任意正整数,也就是跳跃的次数）

t(m − n) ≡ y − x (mod L)
那么，把上述式子转化为不定方程就是：

t(m − n) + Lk = y − x

	 * 
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		long x1=input.nextLong();
		long y=input.nextLong();
		long m=input.nextLong();
		long n=input.nextLong();
		long L=input.nextLong();
		long a=m-n;
		long b=L;
		m=y-x1;
		long d=0;
		try {
			d=linerException(a, b, m);
			long x0=x;//可能为负数
			b/=d;
			b=Math.abs(b);
			x0=(x0%b+b)%b;//求得第一个不为0的解
			System.out.println(x0);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	/**
	 * 转换成求同余方程的x，再转成求一元二次方程，用扩展欧几里得算法求，
	 * 主要是对这个问题进行建模分析，转换形式，需要推导
	 * 求出第一个大于0的解
	 */
	
	static long x;
	static long y;
	
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
		long d=ext_gcd(a,b);
		if(m%d!=0)throw new Exception("无解");
		long n=m/d;
		x*=n;
		y*=n;
		return d;
	}

}
