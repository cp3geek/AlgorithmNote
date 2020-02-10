package 第六章;

public class Nim游戏 {

	
	/**
	 * 一共有N堆石子，编号1..n,第i堆中有a[i]个石子
	 * 每一次操作Alice和Bob可以任意从一堆石子中取出任意数量的石子，
	 * 至少取一颗，至多取出这一堆剩下的所有石子
	 * 两个人轮流行动，取光所有石子的一方获胜，Alice先手
	 * 给定a，假设两人都采用最优策略，谁会获胜？
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[]a= {3,4,5};
		System.out.println(solve(a));

	}
	/**
	 * 异或结果为0先手必输
	 * 异或结果不为0先手必赢
	 * 
	 * 
	 */
	static boolean solve(int[]a) {
		int res=0;
		for(int i=0;i<a.length;i++) {
			res^=a[i];
		}
		return res!=0;
	}

}
