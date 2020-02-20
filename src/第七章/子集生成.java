package 第七章;

import java.util.HashSet;
import java.util.Set;

public class 子集生成 {

	/**
	 * 编写一个方法，返回某集合种的所有子集
	 * 
	 */
	public static void main(String[] args) {
		int[]A= {1,2,3};
		Set<Set<Integer>>set=f(A,A.length,A.length-1);
		for(Set<Integer>nset:set) {
			if(!nset.isEmpty()) {
				System.out.println(nset);
			}
		}
		
		
		

	}
	
	public static Set<Set<Integer>> f(int[]A,int n,int cur){
		Set<Set<Integer>>newSet=new HashSet<Set<Integer>>();
		if(cur==0) {
			Set<Integer>first=new HashSet<Integer>();
			Set<Integer>nil=new HashSet<Integer>();
			
			first.add(A[0]);
			newSet.add(first);
			newSet.add(nil);
			return newSet;
		}
		Set<Set<Integer>>oldSet=f(A,n,cur-1);
		for(Set<Integer>set:oldSet) {
			newSet.add(set);
			Set<Integer> clone=(Set<Integer>)((HashSet)set).clone();
			clone.add(A[cur]);
			newSet.add(clone);
		}
		
		return newSet;
		
	}

}
