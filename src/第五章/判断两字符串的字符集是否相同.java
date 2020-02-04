package 第五章;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 判断两字符串的字符集是否相同 {

	/**
	 * 
	 * 如果限制了ASCII码值，则可以开辟辅助空间，记录
	 * 若没有限制则用哈希映射
	 */
	public static void main(String[] args) {
		System.out.println(f("abcddd","abcd"));

	}
	//map
	static boolean f(String s1,String s2) {
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s1.length();i++) map.put(s1.charAt(i), 1);
	
		for(int i=0;i<s2.length();i++) 
			if(map.get(s2.charAt(i))==null) return false;
		
		map.clear();
		
		for(int i=0;i<s2.length();i++) map.put(s2.charAt(i),1);
		
		for(int i=0;i<s1.length();i++)
			if(map.get(s1.charAt(i))==null)return false;
		
		
		return true;
	}
	
	

}
