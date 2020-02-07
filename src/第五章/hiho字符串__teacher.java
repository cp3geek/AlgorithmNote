package 第五章;

import java.util.Scanner;

public class hiho字符串__teacher {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String s=input.nextLine();
		char[]w=s.toCharArray();
		solve2(w);

	}

	private static void solve2(char[] w) {
		int min=Integer.MAX_VALUE;
		int j=-1;
		for(int i=0;i<w.length;i++) {
			char c=w[i];
			if(check(c)) {
				if(j==-1)j=i+1;
				
				while(j<w.length) {
					char c2=w[j];
					if(check(c2)&&containsAll(w,i,j)) {
						if(check(w,i,j)&&j-i+1<min) {//这道题的坑点
							//因为要求必须恰好满足一个i一个o两个h所以需要判断
							min=j-i+1;
						}
						break;
					}	
					j++;
				}
			}
		}
		System.out.println(min==Integer.MAX_VALUE?-1:min);
		
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

	private static boolean containsAll(char[] w, int i, int j) {
		int c1=0,c2=0,c3=0;
		for(int k=i;k<=j;k++) {
			if(w[k]=='h')c1++;
			if(w[k]=='i')c2++;
			if(w[k]=='o')c3++;
		}
		return c1>=2&&c2>=1&&c3>=1;
	}

	private static boolean check(char c) {
		return c=='h'||c=='i'||c=='o';
	}

}
