package 第七章;

import java.util.HashSet;
import java.util.Set;

public class 子集生成 {

	/**
	 * 编写一个方法，返回某集合种的所有子集
	 * 
	 */
	public static void main(String[] args) {
		int[]A= {1,2,4,7};
		Set<Set<Integer>>set=f(A,A.length-1);
		Set<Set<Integer>>set1=f1(A);
		for(Set<Integer>nset:set) {
			if(!nset.isEmpty()) {
				System.out.println(nset);
			}
		}
		
		
		

	}
	
	public static Set<Set<Integer>> f(int[]A,int cur){
		Set<Set<Integer>>newSet=new HashSet<Set<Integer>>();
		if(cur==0) {
			Set<Integer>first=new HashSet<Integer>();
			Set<Integer>nil=new HashSet<Integer>();
			
			first.add(A[0]);
			newSet.add(first);
			newSet.add(nil);
			return newSet;
		}
		Set<Set<Integer>>oldSet=f(A,cur-1);
		for(Set<Integer>set:oldSet) {
			newSet.add(set);//保留原样
			Set<Integer> clone=(Set<Integer>)((HashSet)set).clone();
			clone.add(A[cur]);
			newSet.add(clone);
		}
		
		return newSet;
		
	}
	
	public static Set<Set<Integer>>f1(int[]A){
		Set<Set<Integer>>res=new HashSet<Set<Integer>>();
		res.add(new HashSet<Integer>());//初始化为空集
		for(int i=0;i<A.length;i++) {//从第一个元素开始
			Set<Set<Integer>>res_new=new HashSet<Set<Integer>>();
			//新建一个集合
			res_new.addAll(res);//保留原样
			for(Set e:res) {//克隆，针对当前元素添加
				Set clone=(Set)((HashSet) e).clone();
				clone.add(A[i]);
				res_new.add(clone);
			}
			res=res_new;
		}
		return res;
	}

}
