package 第七章;

public class 硬币的组合方式 {

	/**
	 * 有1分，5分，10分，25分的硬币，给定一个n，用这四种硬币有多少种方式能凑成n
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int countWays(int n) {
		if(n<=0)return 0;
		return countWaysCore(n,new int[]{1,5,10,25},3);
	}
	
	//cur代表当前最大面值
	private int countWaysCore(int n,int[]coins,int cur) {
		for(int i=0;i*coins[cur]<=n;i++) {
			
		}
		return 1;
	}

}
