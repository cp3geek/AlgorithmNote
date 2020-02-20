package 第七章;

import java.util.ArrayList;

public class 全排列_上 {

	public static void main(String[] args) {
		String s="ABCD";
		ArrayList<String>list=f(s);
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

}
