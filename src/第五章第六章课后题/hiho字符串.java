package 第五章第六章课后题;

import java.util.Scanner;

public class hiho字符串 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		char[]w=s.toCharArray();
		System.out.println(f(w));

	}
	public static int f(char[]w) {
		int minlen=Integer.MAX_VALUE;
		int j=-1;
		for(int i=0;i<w.length;i++) {
			char c=w[i];
			if(check(c)) {
				if(j==-1)j=i+1;
				
				while(j<w.length) {
					char c1=w[j];
					if(check(c1)&&containsAll(w,i,j)) {
						if(check(w,i,j)&&j-i+1<minlen) {
							minlen=j-i+1;
							
						}
						break;
					}
					j++;
				}
			}
		}
		return minlen==Integer.MAX_VALUE?-1:minlen;
	}
	
	private static boolean containsAll(char[] w, int i, int j) {
		int c1=0,c2=0,c3=0;
		for(int k=i;k<=j;k++) {
			if(w[k]=='h')c1++;
			if(w[k]=='i')c2++;
			if(w[k]=='o')c3++;
		}
		return c1>=2&&c2>=1&&c3>=1;
	}
	
	public static boolean check(char c) {
		return c=='h'||c=='i'||c=='o';
	}
	private static boolean check(char[] w, int i, int j) {
		int c1=0,c2=0,c3=0;
		for(int k=i;k<=j;k++) {
			if(w[k]=='h')c1++;
			if(w[k]=='i')c2++;
			if(w[k]=='o')c3++;
		}
		return c1==2&&c2==1&&c3==1;
	}

}
