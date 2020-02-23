package 第七章;

import java.util.ArrayList;
import java.util.Scanner;

public class 部分和 {

	/**
	 * 给定整数序列a1,a2,a3...an,判断是否可以从中选出若干数
	 * 使他们的和恰好为k
	 * 输入：
	 * n=4
	 * a={1,2,4,7}
	 * k=13
	 * 输出：
	 * yes(13=2+4+7)
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<ArrayList<Integer>>list=f(a,n-1);
		for(ArrayList<Integer>l:list) {
			int all=0;
			for(int i=0;i<l.size();i++) {
				all+=l.get(i);
			}
			if(all==k) {
				for(int i=0;i<l.size();i++) {
					System.out.print(l.get(i)+"+");
				}
			}
		}

	}
	
	public static ArrayList<ArrayList<Integer>>f(int[]a,int cur){
		ArrayList<ArrayList<Integer>>
		newlist=new ArrayList<>();
		
		if(cur==0) {
			ArrayList<Integer>first=new ArrayList<Integer>();
			ArrayList<Integer>nil=new ArrayList<Integer>();
			
			first.add(a[0]);
			newlist.add(nil);
			newlist.add(first);
			return newlist;
		}
		
		
		
		ArrayList<ArrayList<Integer>>oldlist=f(a,cur-1);
		for(ArrayList<Integer>el:oldlist) {
			newlist.add(el);
			ArrayList<Integer>clone=(ArrayList<Integer>)el.clone();
			clone.add(a[cur]);
			newlist.add(clone);
		}
		return newlist;
		
		
		
		
		
	}

}
