package 第五章第六章课后题;

import java.util.Scanner;

public class KMP算法 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		for(int i=0;i<N;i++) {
			String p=input.next();
			String s=input.next();
			f(s,p);
		}

	}
	public static void f(String s,String p) {
		int count=0;
		if(s.length()==0||p.length()==0)System.out.println(-1);
		if(p.length()>s.length())System.out.println(-1);
		int[]next=next(p);
		int i=0,j=0;
		int sLen=s.length();
		int pLen=p.length();
		while(i<sLen) {
			while(j!=-1&&s.charAt(i)!=p.charAt(j))j=next[j];
			i++;
			j++;
			if(j==pLen) {
				count++;
				i--;
				j=next[j-1];
			}
		}
		System.out.println(count);
		
		
		
		
		
	}
	
	public static int[]next(String ps){
		int pLen=ps.length();
		int[]next=new int[pLen];
		char[]p=ps.toCharArray();
		next[0]=-1;
		if(ps.length()==1)return next;
		
		next[1]=0;
		int j=1;
		int k=next[j];
		while(j<p.length-1) {
			if(k<0||p[j]==p[k]) {
				next[++j]=++k;
			}else {
				k=next[k];
			}
		}
		return next;
		
	}
	

}
