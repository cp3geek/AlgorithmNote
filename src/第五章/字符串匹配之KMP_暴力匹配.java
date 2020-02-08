package 第五章;

public class 字符串匹配之KMP_暴力匹配 {

	public static void main(String[] args) {
		String s="babababcbabababb";
		String p="bababb";
		int i=match(s,p);
		System.out.println(i);

	}
	
	static int match(String s,String p) {
		int i=0,j=0;int k=0;
		while(i+p.length()<s.length()) {
			if(s.charAt(k)==p.charAt(j)) {
				j++;
				k++;
				if(j==p.length())return i;
			}else {
				i++;
				j=0;
				k=i;
			}
		}
		
		return -1;
	}

}
