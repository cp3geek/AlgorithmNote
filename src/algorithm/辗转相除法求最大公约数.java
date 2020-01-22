package algorithm;

public class 辗转相除法求最大公约数 {

	public static void main(String[] args) {
		System.out.println(f(32,24));

	}
	
	static int f(int m,int n) {
		if(n==0)return m;
		return f(n,m%n);
	}
	

}
