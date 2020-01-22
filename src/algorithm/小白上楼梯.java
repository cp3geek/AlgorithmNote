package algorithm;

public class 小白上楼梯 {

	/**
	 * 
	 * 小白正在上楼梯，楼梯有n阶台阶，小白一次可以上1阶，2阶或者3阶
	 * 实现一个方法，计算小白有多少种走完楼梯的方法
	 */
	public static void main(String[] args) {
		System.out.println(f(4));

	}
	
	static int f(int n) {
		if(1==n)return 1;
		if(2==n)return 2;
		if(3==n)return 4;
		
		return f(n-1)+f(n-2)+f(n-3);
	}

}
