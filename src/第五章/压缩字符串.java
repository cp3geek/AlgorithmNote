package 第五章;

public class 压缩字符串 {

	/**
	 * 利用字符重复出现的次数，实现基本的字符串压缩功能
	 * 比如字符串:"aabcccccaaa"压缩后变成a2b1c5a3,若压缩后的字符串长度没有变短，则返回原来的串
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(f("aabcccccaaabbcccc"));

	}
	
	static String f(String str) {
		int count=0;
		int last=str.charAt(0);
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char charAt=str.charAt(i);
			if(sb.length()==0) {
				sb.append(charAt);
				count++;
			}else {
				if(last==charAt) {
					count++;
				}else {
					sb.append(count).append(charAt);
					count=1;
					last=charAt;
				}
			}
		}
		if(count>=1)sb.append(count);
		
		
		return sb.length()<str.length()?sb.toString():str;
	}

}
