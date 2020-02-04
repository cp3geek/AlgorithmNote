package 第五章;

public class 翻转字符串 {

	public static void main(String[] args) {
		System.out.println(f("abc jkl"));
		System.out.println(f1("this is a pig"));
	}
	
	static String f(String str) {
		StringBuilder sb=new StringBuilder(str);
		return sb.reverse().toString();//运用api
	}
	//通过字符数组翻转
	static String f1(String str) {
		char[]newchar=str.toCharArray();
		
		
		for(int i=0;i<str.length();i++) {
			newchar[i]=str.charAt(str.length()-i-1);
		}
		return new String(newchar);
	}

}
