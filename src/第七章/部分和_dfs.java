package 第七章;

import java.util.ArrayList;
import java.util.Scanner;

public class 部分和_dfs {

	public static int kk=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int k=sc.nextInt();
		kk=k;
		dfs(a,k,0,new ArrayList<Integer>());
	}
	public static void dfs(int[]a ,int k,int cur,ArrayList<Integer>list) {		
		if(k==0) {
			System.out.print("Yes("+kk+"=");
			int size=list.size();
			for(int i=0;i<size;i++) {
				System.out.print(list.get(i)+(i==size-1?")":"+"));
			}
			System.exit(0);
		}
		if(k<0||cur==a.length)return;
		
		//有两种平行状态
		dfs(a,k,cur+1,list);//不要当前元素
		
		list.add(a[cur]);
		int index=list.size()-1;
		dfs(a,k-a[cur],cur+1,list);//要当前元素
		list.remove(index);
	}

}
