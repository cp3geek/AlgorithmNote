package 第六章;

public class 裴蜀等式 {
	
	/**
	 * 也称贝祖等式
	 * 对任何整数a,b和他们的最大公约数d,关于未知数x和y的线性二元一次方程（称为裴蜀等式）
	 * ax+by=m有整数解时当且仅当m是d的倍数
	 * 裴蜀等式有解时必然有无穷多个整数解，每组解x,y都称为裴蜀数，
	 * 可用扩展欧几里得算法求得。
	 * 12x+42y=6有解
	 * x=4,y=-1
	 * x=11,y=-3
	 * 可以推出
	 * 令 d = gcd(a, b)，t 为任意数
	x = x0 + b / d * t
	y = y0 - a / d * t
	 * x的系数约掉d为2
	 * y的系数约掉d为7
	 * 得到最简的方程式为2x+7y=1
	 * 则解为x+7或者-7，y+2或者-2
	 * 特别得，方程ax+by=1有整数解当且仅当整数a和b互素
	 * 
	 */

	
	/**
	 * a%b=k ---->a=(a/b)*b+k ---->k=a-(a/b)*b
	 * 所以a%b=a-(a/b)*b
	 * 
	 */
	
	/**
	 * 扩展欧几里得算法就是在求a,b的最大公约数m=gcd(a,b)的同余时，求出贝祖等式ax+by=m的一个解 (x0,y0)
	 * 如何递推
	 * x=y1
	 * y=x1-a/b*y1
	 * 
	 * 通解：
	 * x=x0+(b/gcd)*t
	 * y=y0-(a/gcd)*t
	 * 
	 * 
	 * 
	 */
	static long x;
	static long y;
	public static void main(String[] args) {
		try {
			linearEquation(97, -127, 1);
			System.out.println(x+" "+y);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * 
	 * 扩展欧几里得
	 * 调用完成后xy是ax+by=gcd(a,b)的解;
	 * 
	 * 
	 */
	public static long ext_gcd(long a,long b) {
		if(b==0) {
			x=1;
			y=0;
			return a;
		}
		long res=ext_gcd(b,a%b);
		//x，y已经被下一层更新了
		long x1=x;//备份x
		x=y;//更新x
		y=x1-a/b*y;//更新y
		return res;
	}
	public static long linearEquation(long a,long b,long m) throws Exception {
		long d=ext_gcd(a,b);
		//m不是gcd(a,b)的倍数，此方程无解
		if(m%d!=0)throw new Exception("无解");
		long n=m/d;
		x*=n;
		y*=n;
		return d;
	}

}
