package 第七章;

import java.util.ArrayList;
import java.util.Scanner;

public class 部分和_子集生成_二进制 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<ArrayList<Integer>>list=f(a,n,k);
		for(ArrayList<Integer>l:list) {
			System.out.print(k+"=");
			for(Integer i:l) {
				System.out.print(i+"+");
			}
		}
		

	}
	
	static ArrayList<ArrayList<Integer>>f(int[]a,int n,int k){
		ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
		
		for(int i=(int)Math.pow(2, n)-1;i>0;i--) {
			ArrayList<Integer>list_new=new ArrayList<Integer>();
			int all=0;
			for(int j=n-1;j>=0;j--) {
				if(((i>>j)&1)==1) {
					list_new.add(a[j]);
					all+=a[j];
				}
			}
			if(all==k) {
				list.add(list_new);
				return list;
				}
		}
		return list;
	}

}
