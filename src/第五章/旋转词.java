package 第五章;

public class 旋转词 {

	/**
	 * 给定两个字符串s1和s2,要求判定s2是否能够通过s1作循环移位得到的字符串包含。
	 * 例如，给定s1=AABCD和s2=CDAA，返回true，给定s1=ABCD和s2=ACBD返回false
	 * 
	 * AABCD的旋转此有
	 * ABCDA,BCDAA,CDAAB,DAABC
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(f("ABCD","ACBD"));

	}
	static boolean f(String s1,String s2) {
		StringBuilder sb=new StringBuilder();
		sb.append(s1).append(s1);
		return sb.toString().contains(s2);
	}

}
