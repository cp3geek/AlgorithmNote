package 第六章;

public class 特殊的同余方程_逆元 {
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
		try {
			inverseElement(13, 5);
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("无解");
		}
	}
	
	public static long inverseElement(long a,long mo) throws Exception {
		long d=linerException(a, mo, 1);
		x=(x%mo+mo)%mo;//保证x>0;//这里不用再mo/d(b/d)，是因为a和mo互素，才有解
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
