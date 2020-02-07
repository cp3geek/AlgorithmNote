package 第五章;

import java.util.Arrays;

public class hiho字符串 {

	/**
	 * 如果一个字符串恰好包含2个h,1个i和1个o，我们就称这个字符串是hiho字符串
	 * 例如oihateher，hugeinputhugeoutput都是hiho字符串
	 * 现在给定一个只包含小写字母的字符串s，小hi想知道s的所有子串中，最短的hiho子串是那个
	 * 输出该子串的长度
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String str="hugeinputhugeoutput";
		solve(str);
	}

	private static void solve(String str) {
		int minlen=Integer.MAX_VALUE;
		int[]keyFound= new int[3];
		for(int i=0;i<str.length();i++) {
			Arrays.fill(keyFound, 0);
			char c=str.charAt(i);
			if(check(c)==false) {
				continue;
			}else {
				if(c=='h')keyFound[0]++;
				else if(c=='i')keyFound[1]++;
				else keyFound[2]++;
				
				int j=i+1;
				for(;j<str.length();j++) {
					char c1=str.charAt(j);
					if(check(c1)==false) {
						continue;
					}else {
						if(c=='h')keyFound[0]++;
						else if(c=='i')keyFound[1]++;
						else keyFound[2]++;
						
						if(sum(keyFound)==4) {
							if(j-i+1<minlen) {
								minlen=j-i+1;
							}
							break;
						}
					}
				}
			}
		}
		System.out.println(minlen);
		
	}

	private static int sum(int[] keyFound) {
		int sum=0;
		for(int i=0;i<keyFound.length;i++) {
			sum+=keyFound[i];
		}
		return sum;
	}

	private static boolean check(char c) {
		return c=='h'||c=='i'||c=='o';
	}

}
