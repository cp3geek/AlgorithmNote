package 第七章;

import java.util.ArrayList;

public class 子集生成之二进制解法 {

	public static void main(String[] args) {
		int[]A= {1,2,3};
		ArrayList<ArrayList<Integer>>list=f(A,A.length);
		System.out.println(list);

	}
	
	public static ArrayList<ArrayList<Integer>>f(int[]A,int n){
		ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
		
		
		for(int i=(int)Math.pow(2, n)-1;i>0;i--) {
			ArrayList<Integer>newlist=new ArrayList<Integer>();
			for(int j=n-1;j>=0;j--) {
				if(((i>>j)&1)==1) {
					newlist.add(A[j]);
				}
			}
			list.add(newlist);
		}
		return list;
	}

}
