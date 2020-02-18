package 第七章;

public class 机器人走方格 {
	/**
	 * 有一个x*y的网格，一个机器人只能走格点，且只能向右或者向下走，要从左上角走到右下角
	 * 请设计一个算法，计算机器人有多少种走法
	 * 给定两个正整数x和y，请返回机器人的走法数目。保证x+y<=12
	 * 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(f(6,6));

	}
	public static int f(int x,int y) {
		if(x==1||y==1)return 1;
		return f(x-1,y)+f(x,y-1);
	}

}
