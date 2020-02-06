package 第五章;

public class 回文串 {

	/**
	 * 判断字符串是否为回文串
	 * abcba,abcda
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(f(""));

	}
	static boolean f(String str) {
		if(str.length()==0)return true;
		return str.equals(new StringBuilder(str).reverse().toString());
	}

}
