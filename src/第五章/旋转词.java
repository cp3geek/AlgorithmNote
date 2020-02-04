package 第五章;

public class 旋转词 {

	/**
	 * 给定两个字符串s1和s2,要求判定s2是否能够通过s1作循环移位得到的字符串包含。
	 * 例如，给定s1=AABCD和s2=CDAA，返回true，给定s1=ABCD和s2=ACBD返回false
	 * 
	 * AABCD的旋转此有
	 * ABCDA,BCDAA,CDAAB,DAABC
	 * 解析：
	 * A ABCDA
	 * AA BCDAA
	 * AAB CDAAB
	 * AABC DAABC
	 */
	
	public static void main(String[] args) {
		System.out.println(f("AABCD","CDAA"));

	}
	//意思就是拼接s1，如果其中的子串包含s2,则s2为s1的旋转词/不是求子串，如果是子串则需要判断长度相等
	//AABCDAABCD 
	static boolean f(String S1,String S2) {
		StringBuilder sb=new StringBuilder();
		sb.append(S1).append(S1);
		return sb.toString().contains(S2);
	}

}
