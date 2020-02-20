package 第七章;

import java.util.ArrayList;

public class 全排列_上 {

	public static void main(String[] args) {
		String s="ABC";
		ArrayList<String>list=f(s);
		System.out.println(list);

	}
	
	
	public static ArrayList<String>f(String A){
		int n=A.length();
		ArrayList<String>res=new ArrayList<String>();
		res.add(A.charAt(0)+"");
		
		
		for(int i=1;i<n;i++) {
			ArrayList<String>res_new=new ArrayList<String>();
			char c=A.charAt(i);
			for(String str:res) {
				String newStr=c+str;
				res_new.add(newStr);
				newStr=str+c;
				res_new.add(newStr);
				
				//加在中间
				for(int j=1;j<str.length();j++) {
					newStr=str.substring(0, j)+c+str.substring(j);
					res_new.add(newStr);
				}
			}
			res=res_new;
		}
		
		return res;
	}

}
