package algorithm;

public class 求N的阶乘 {

	public static void main(String[] args) {
		System.out.println(f(10));

	}
	
	static int f(int n) {
		
		if(n==1)return 1;
		return n*f(n-1);
	}

}
