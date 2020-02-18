package 第七章;

public class 硬币的组合方式 {

	/**
	 * 有1分，5分，10分，25分的硬币，给定一个n，用这四种硬币有多少种方式能凑成n
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(countWays(100));

	}
	
	private static int countWays(int n) {
		if(n<=0)return 0;
		return countWaysCore(n,new int[]{1,5,10,25},3);
	}
	
	//cur代表当前最大面值,每次处理最大面值，剩余交给后面处理
	private static int countWaysCore(int n,int[]coins,int cur){
		if(cur==0)return 1;//用1来凑，永远只有一种，出口
		int res=0;
		//不取当前最大面值，取一个，取两个。。。具体可以循环几次，取决与n
		//例如n等100，最大面值为25，则最大面值有5种取法（不取也算一种）0，1，2，3，4
		for(int i=0;i*coins[cur]<=n;i++) {
			int shengyu=n-i*coins[cur];
			res+=countWaysCore(shengyu, coins, cur-1);//累加结果
		}
		return res;
	}

}
