package 第五章;

public class 字符串匹配之KMP_暴力匹配 {

	public static void main(String[] args) {
		String s="ababababab";
		String p="aba";

//		System.out.println(match(s, p));
		m(s,p);
		

	}
	
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
