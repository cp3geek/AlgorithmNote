package 第五章;

import java.util.Arrays;

public class 变形词 {

	
	/**
	 * 变形词：两个字符串有相同的字符及数量组成
	 * 给定两个字符串，编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串
	 * 规定大小写为不同的字符，且考虑字符中的空格
	 * 测试样例：
	 * "Here you are","Are you here"
	 * 返回false
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(f("Here you are","Are you here"));
		System.out.println(f1("abcdxe","decbsa"));

	}
	//第一种方式，转换成字符数组并排序，比较数组是否相同，时间复杂度o(nlogn)
	
	static boolean f(String s1,String s2) {
		int len1=s1.length();
		int len2=s2.length();
		if(len1!=len2)return false;
		
		char[]s12c=s1.toCharArray();
		char[]s22c=s2.toCharArray();
		
		Arrays.sort(s12c);
		Arrays.sort(s22c);
		
		return Arrays.equals(s12c, s22c);//工具类，判断数组是否相等
	}
	//开辟辅助空间
	static boolean f1(String s1,String s2) {
		if(s1.length()!=s2.length())return false;
		
		
		int[]help=new int[256];//完整的ASCII码值表，一般用128
		
		for(int i=0;i<s1.length();i++) {
			int c=(int)s1.charAt(i);
			help[c]++;
		}
		
		for(int i=0;i<s2.length();i++) {
			int c=(int)s2.charAt(i);
			if(help[c]--<0)return false;
			else help[c]--;
		}
		
		for(int i=0;i<help.length;i++) {
			if(help[i]>0)return false;
		}
		
		return true;
	}

}
