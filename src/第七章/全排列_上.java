package 第七章;

import java.util.ArrayList;

public class 全排列_上 {

	public static void main(String[] args) {
		String s="ABC";
		ArrayList<String>list=f1(s,s.length()-1);
		System.out.println(list);

	}
	
	
	public static ArrayList<String>f(String A){
		ArrayList<String>list=new ArrayList<String>();
		int n=A.length();
		list.add(A.charAt(0)+"");
		
		for(int i=1;i<n;i++) {
			char c=A.charAt(i);
			ArrayList<String>newlist=new ArrayList<String>();
			for(String str:list) {
				String newStr=c+str;
				newlist.add(newStr);
				newStr=str+c;
				newlist.add(newStr);
				
				for(int j=1;j<str.length();j++) {
					newStr=str.substring(0, j)+c+str.substring(j);
					newlist.add(newStr);
				}
			}
			list=newlist;
		}
		return list;
	}
	
	public static ArrayList<String>f1(String A,int cur){
		ArrayList<String>newlist=new ArrayList<String>();
		
		if(cur==0) {
			newlist.add(A.charAt(0)+"");
			return newlist;
		}
		
		
		ArrayList<String>oldlist=f1(A,cur-1);
		
		
		for(String str:oldlist) {
			char c=A.charAt(cur);
			newlist.add(c+str);
			newlist.add(str+c);
			for(int j=1;j<str.length();j++) {
				newlist.add(str.substring(0, j)+c+str.substring(j));
			}
		}
		return newlist;
		
	}

}
