package 第五章;

public class 替换字符串中的空格 {

	/**
	 * 将字符串中的空格全部替换为%20.假定该字符串有足够的空间存放新的字符并且知道
	 * 字符串的真实长度小于1000，同时保证字符串由大小写的英文字母组成
	 * 测试样例：
	 * "Mr John Smith"
	 * 返回:"Mr%20John%20Smith"
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(f("Mr John Smith"));
		System.out.println(f1("Mr John Smith"));
	}
	
	//使用java api，String里面的替换方法
	static String f(String str) {
		return str.replaceAll("\\s", "%20");//空格用\\s表示
	}
	
	//通用方法，不使用api
	static String f1(String str) {
		int count=str.length()-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ')count+=3;
		}
		int size=count-1;
		char[]s=new char[size];
		int j=size-1;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==' ') {
				s[j--]='0';
				s[j--]='2';
				s[j--]='%';
			}else {
				s[j--]=str.charAt(i);
			}
		}
		return new String(s);
	}

}
