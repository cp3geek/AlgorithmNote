package 第七章;

public class 走楼梯 {

	/**
	 * 有个小孩正在上楼梯，楼梯有n阶，小孩一次可以上1阶，2阶，3阶
	 * 请实现一个方法，计算小孩有多少种上楼梯得方式
	 * 为了防止溢出，请将结果mod1000000007
	 * 给定一个正整数n，请返回一个数，代表上楼梯得方式数
	 * 保证n小于10000；
	 */
	public static void main(String[] args) {
		System.out.println(f(34));
		System.out.println(f1(34));

	}
	public static int f(int n) {
		int mod=1000000007;
		if(n<=0)return 0;
		else if(n==1)return 1;
		else if(n==2)return 2;
		else if(n==3)return 4;
		else return f(n-3)%mod+f(n-2)%mod+f(n-1)%mod;
	}
	//用循环递推得方式
	public static int f1(int n) {
		if(n<=0)return 0;
		if(n==1)return 1;
		if(n==2)return 2;
		if(n==3)return 4;
		int mod=1000000007;
		int x1=1;
		int x2=2;
		int x3=4;
		for(int i=4;i<=n;i++) {
			int x_=(x1+x2+x3)%mod;
			x1=x2%mod;
			x2=x3%mod;
			x3=x_%mod;
		}
		return x3;
	}

}
