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
		System.out.println(f(36));

	}
	public static int f(int n) {
		if(n==1)return 1;
		else if(n==2)return 2;
		else if(n==3)return 4;
		else return ((f(n-3)+f(n-2)+f(n-1))%1000000007);
	}

}
