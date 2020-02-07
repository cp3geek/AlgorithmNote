package 第五章;

import java.util.Arrays;

public class 最短摘要的生成 {

	
	/**
	 * 给定一段产品的英文描述，包含M个英文单词，每个英文单词以空格分隔，无其他标点符号
	 * 再给定N个英文单词关键字，请说明思路并编程实现
	 * String extractSummary(String description,String[]key words)
	 * 目标是找出此产品描述中包含N个关键字（每个关键词至少出现一次）的长度最短的子串，作为产品简介输出
	 * 
	 */
	public static void main(String[] args) {
		solve2(new String[] {"a","b","c","d","h","e","f","c","c","d","e","f","d","C"},new String[] {"c","e"});
		

	}
	
	/**
	 * 
	 * word在关键字数组的第几位
	 * 
	 * 
	 */
	static int indexOf(String[]q,String word) {
		for(int i=0;i<q.length;i++) {
			if(q[i].equals(word)) {
			return i;
			}
		}
		return -1;
	}
	static int sum(int[]keyFound) {
		int sum=0;
		for(int e:keyFound) {
			sum+=e;
		}
		return sum;
	}

	private static void solve2(String[] w, String[] keys) {
		//begin和end用于在找到更短得包含全部关键字得子数组时更新
		int begin=-1;
		int end=-1;
		int p2=-1;
		int minlen=Integer.MAX_VALUE;
		int[]keyFound=new int[keys.length];
		
		for(int i=0;i<w.length;i++) {
			Arrays.fill(keyFound, 0);
			String word1=w[i];
			int index=indexOf(keys,word1);
			if(-1==index)continue;
			else keyFound[index]=1;
			
			int j;
			if(p2!=-1)j=p2;
			else j=i+1;
			
			for(;j<w.length;j++) {
				String word2=w[j];
				int index1=indexOf(keys, word2);
				if(index1==-1||keyFound[index1]==1) 
				continue;
				else {
					keyFound[index1]=1;
					if(sum(keyFound)==keys.length) {
						p2=j;
						if(j-i+1<minlen) {
							minlen=j-i+1;
							begin=i;
							end=j;
						}
						break;
					}
				}
			}
			
		}
		print(w,begin,end);
		
	}

	private static void print(String[] w, int begin, int end) {
		System.out.println(begin+" "+end);
		for(int i=begin;i<=end;i++) {
			System.out.print(w[i]+" ");
		}
		
	}
	
	

}
