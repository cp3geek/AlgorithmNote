package 第七章;

import java.util.HashSet;
import java.util.Set;

public class 合法括号 {

	/**
	 * 实现一个算法，打印n对括号的全部有效组合（即左右括号正确配对）
	 * 示例
	 * 输入：3
	 * 输出:
	 * ((()))  (()())  (())()   ()(())  ()()()
	 */
	public static void main(String[] args) {
		Set<String>s=f1(2);
		System.out.println(s);

	}
	//在上一个集合的基础上，左边加括号，右边加括号，包起来，1生3，去掉重复
	public static Set<String>f(int n){
		Set<String>s_n=new HashSet<>();
		if(n==1) {
			s_n.add("()");
			return s_n;
		}
		Set<String>s_n_1=f(n-1);//得到上一个集合
		for(String el:s_n_1) {//遍历上一个集合里面的元素
			s_n.add("()"+el);//
			s_n.add(el+"()");
			s_n.add("("+el+")");
		}
		
		return s_n;
	}
	public static Set<String>f1(int n){
		Set<String>s_n=new HashSet<String>();
		s_n.add("()");
		if(n==1) {
			return s_n;
		}
		for(int i=2;i<=n;i++) {
			Set<String>s_new=new HashSet<String>();
			for(String el:s_n) {
				s_new.add("()"+el);
				s_new.add(el+"()");
				s_new.add("("+el+")");
			}
			s_n=s_new;
		}
		return s_n;
		
	}

}
