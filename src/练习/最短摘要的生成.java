package 练习;

import java.util.Arrays;

public class 最短摘要的生成 {

	public static void main(String[] args) {
		solve2(new String[] {"a","b","c","d","h","e","f","c","c","d","e","f","d","C"},new String[] {"c","e"});

	}

	private static void solve2(String[] w, String[] keys) {
		int begin=-1;//记录最短摘要得起始位置
		int end=-1;//记录最短摘要得终点位置
		int minlen=Integer.MAX_VALUE;//最短长度
		int[] keyFound=new int[keys.length];//记录关键字出现得数组
		
		for(int i=0;i<w.length;i++) {
			Arrays.fill(keyFound, 0);//结算一次需要清空
			String word=w[i];
			int index=indexOf(keys,word);//找到当前字符是否在关键字数组中的下标
			if(index==-1) {
				continue;
			}else {
				keyFound[index]=1;//找到第一个关键字后
				int j=i+1;//i不动，j继续找后面的关键字
				
				for(;j<w.length;j++) {//
					String word1=w[j];
					int index1=indexOf(keys,word1);
					if(index1==-1||keyFound[index1]==1) {//如果重复出现第一次出现的关键字不能重复标记
						continue;
					}else {
						keyFound[index1]=1;
						
						if(sum(keyFound)==keys.length) {//判断是否囊括完所有关键字，计算长度
							if(j-i+1<minlen) {//判断当前是否为最短
								minlen=j-i+1;
								begin=i;
								end=j;
							}
							break;//退出j的循环，开始找后面
						}
					}
				}
				
				
				
			}
		}
		print(w,begin,end);//打印
		
	}

	private static void print(String[] w, int begin, int end) {
		System.out.println(begin+" "+end);
		for(int i=begin;i<=end;i++) {
			System.out.println(w[i]);
		}
		
	}

	private static int sum(int[] keyFound) {
		int sum=0;
		for(int i:keyFound) {
			sum+=i;
		}
		return sum;
	}

	private static int indexOf(String[] keys, String word) {
		for(int i=0;i<keys.length;i++) {
			if(keys[i].equals(word))return i;
		}
		return -1;
	}

}
