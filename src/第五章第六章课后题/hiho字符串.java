package 第五章第六章课后题;

import java.util.Arrays;
import java.util.Scanner;

public class hiho字符串 {

	/**
	 * 描述
如果一个字符串恰好包含2个'h'、1个'i'和1个'o'，我们就称这个字符串是hiho字符串。  

例如"oihateher"、"hugeinputhugeoutput"都是hiho字符串。

现在给定一个只包含小写字母的字符串S，小Hi想知道S的所有子串中，最短的hiho字符串是哪个。

输入
字符串S  

对于80%的数据，S的长度不超过1000  

对于100%的数据，S的长度不超过100000

输出
找到S的所有子串中，最短的hiho字符串是哪个，输出该子串的长度。如果S的子串中没有hiho字符串，输出-1。

样例输入
happyhahaiohell
样例输出
5
	 * 
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String str=input.next();
		System.out.println(f(str));

	}
	public static boolean indexOf(char c) {
		return c=='h'||c=='i'||c=='o';
	}
	public static int f(String str) {
		int minlength=Integer.MAX_VALUE;
		int[]keyFound=new int[3];
		int i=0;
		
		for(;i<str.length();i++) {
			Arrays.fill(keyFound, 0);
			char word=str.charAt(i);
			if(indexOf(word)) {
				if(word=='h')keyFound[0]++;
				else if(word=='i')keyFound[1]++;
				else keyFound[2]++;
				
				for(int j=i+1;j<str.length();j++) {
					char word1=str.charAt(j);
					if(indexOf(word1)) {
						if(word1=='h')keyFound[0]++;
						else if(word1=='i')keyFound[1]++;
						else keyFound[2]++;
					}
					if((keyFound[0]==2)&&(keyFound[1]==1)&&(keyFound[2]==1)) {
						if(j-i+1<minlength) {
							minlength=j-i+1;
							break;
						}
					}
				}
			}
		}
		
		
		
		return minlength==Integer.MAX_VALUE?-1:minlength;
	}

}
