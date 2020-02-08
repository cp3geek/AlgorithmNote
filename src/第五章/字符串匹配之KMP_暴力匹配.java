package 第五章;

public class 字符串匹配之KMP_暴力匹配 {

	public static void main(String[] args) {
		String s="bababcbababababb";
		String p="bababb";

//		System.out.println(match(s, p));
		m(s,p);
		

	}
	
	//找出第一个匹配子串的首下标
	static int match(String s,String p) {
		int i=0,j=0;int sc=i;
		while(sc<s.length()) {
			if(s.charAt(sc)==p.charAt(j)) {
				j++;
				sc++;
				if(j==p.length())return i;
			}else {
				i++;
				j=0;
				sc=i;
			}
		}
		
		return -1;
	}
	
	//找出所有匹配子串的首下标
	static void m(String s,String p) {
		int i=0,j=0;int sc=i;
		while(sc<s.length()) {
			if(s.charAt(sc)==p.charAt(j)) {
				j++;
				sc++;
				if(j==p.length()) {
					System.out.println(i);
					j=0;
					i++;
					sc=i;
				}
			}else {
				i++;
				j=0;
				sc=i;
			}
		}
	}
	
	
	
	

}
