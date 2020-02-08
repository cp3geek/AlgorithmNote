package 第五章;

public class Pabinkarp_滚动hash {

	public static void main(String[] args) {
		String p="ABA";
		String s="ABABABA";
		match(p,s);

	}
	static final long seed=31;
	
	
	static void match(String p,String s) {
		long hash_p=hash(p);
		long[]hashOfS=hash(s,p.length());
		match(hash_p,hashOfS);
	}
	
	private static long[] hash(String s, final int n) {
		long[]res=new long[s.length()-n+1];
		//前n个字符的hash
		res[0]=hash(s.substring(0,n));
		for(int i=n;i<s.length();i++) {
			char newChar=s.charAt(i);
			char oChar=s.charAt(i-n);
			//前n个字符的hash*seed-前n个字符的第一个字符*seed的n次方
			
			long v=(res[i-n]*seed+newChar-(long)Math.pow(seed, n)*oChar)%Long.MAX_VALUE;
			res[i-n+1]=v;
		}
		return res;
	}

	private static void match(long hash_p, long[] hash_s) {
		for(int i=0;i<hash_s.length;i++) {
			if(hash_p==hash_s[i]) {
				System.out.println("match:"+i);
			}
		}
		
	}
	
	

	static long hash(String str) {
		long hash=0;
		for(int i=0;i!=str.length();i++) {
			hash=seed*hash+str.charAt(i);
		}
		return hash%Long.MAX_VALUE;
	}

}
