package 第六章;

public class 欧几里得算法 {

	/**
	 * 就是辗转相除法
	 * 求解最大公约数
	 */
	public static void main(String[] args) {
		

	}
	
	public static int gcd(int m,int n) {
		return n==0?m:gcd(n,m%n);
	}

}
