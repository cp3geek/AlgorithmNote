package 练习;

public class 字符串匹配暴力匹配练习 {

	public static void main(String[] args) {
		String s="bababcbababababb";
		String p="bababb";
//		System.out.println(match(s,p));
		m(new String("ababababab"),new String("aba"));
	}
	
	
	static int match(String s,String p) {
		int i=0,j=0,sc=i;
		
		while(sc<s.length()) {
			if(s.charAt(sc)==p.charAt(j)) {
				sc++;
				j++;
				if(j==p.length()) {
					return i;
				}
			}else {
				i++;
				sc=i;
				j=0;
			}
		}
		return -1;
	}
	
	static void m(String s,String p) {
		int i=0,j=0,sc=i;
		
		while(sc<s.length()) {
			if(s.charAt(sc)==p.charAt(j)) {
				sc++;
				j++;
				if(j==p.length()) {
					System.out.println(i);
					i++;
					j=0;
					sc=i;
				}
			}else {
				i++;
				sc=i;
				j=0;
			}
		}
		
		
	}

}
