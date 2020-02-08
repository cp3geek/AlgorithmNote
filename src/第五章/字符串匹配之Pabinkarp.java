package 第五章;

public class 字符串匹配之Pabinkarp {

	/**
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String s="ABABABA";
		String p="ABA";
		match(p,s);

	}
	
	
	
	static final long seed=31;//随机素数
	
	
	
	/**
	 * 使用10000个不同字符串产生的冲突数，大概在0-3之间波动，使用100万种不同的
	 * 字符串，冲突数大概在110+波动
	 * 
	 * 
	 */
	static long hash(String str) {
		long hash=0;
		//C0*31²+C1*31+C2
		for(int i=0;i!=str.length();i++) {
			hash=seed*hash+str.charAt(i);
		}
		//实际循环:((0+C0)*31+C1)*31+C2
		return hash%Long.MAX_VALUE;
	}
	//时间复杂度并没有优化多少
	private static void match(String p,String s) {
		long hash_p=hash(p);
		int p_len=p.length();
		for(int i=0;i+p_len<=s.length();i++) {
			long hash_i=hash(s.substring(i,i+p_len));//i为起点，i+匹配串的长度，截取出子串,计算哈希，比较
			if(hash_i==hash_p) {
				System.out.println("match:"+i);
			}
		}
	}

}
