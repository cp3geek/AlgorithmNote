package algorithm;

import java.util.HashMap;
import java.util.Map;

public class 出现k次和出现1次 {

	public static void main(String[] args) {
		int[] a= {2,5,2,5,2,5,6,6,6,9,9,9,1,0,0,0,1,1,10};
		int max=0;
		int len=a.length;
		char[][] karr=new char[len][];//可以只指定行数
		int k=3;
		
		for(int i=0;i<len;i++) {
			karr[i]=new 
					StringBuilder(
					Integer.toString(a[i],3))
					.reverse()
					.toString().toCharArray();
			//字符数组用于存储转成三进制后的数，并反转，为了保证低位对齐
			if(karr[i].length>max)max=karr[i].length;
			
		}
		
		
		int[]res=new int[max];
		for(int i=0;i<len;i++) {
			for(int j=0;j<res.length;j++) {
				if(j>=karr[i].length) {//每一行的每一列相加
					//内循环三次，三列值改变，数组遍历从左往右
					res[j]+=0;
				}else {
					res[j]+=(karr[i][j]-'0');
				}
			}
		}
		
		int result=0;
		for(int i=0;i<res.length;i++) {
			result+=(res[i]%k)*(int)Math.pow(k, i);
		}
		
		System.out.println(result);
		//这道题用map键值对很好做
		Map<Integer, Integer>map=new HashMap();
		for(int i=0;i<a.length;i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}else {
				map.put(a[i], map.get(a[i])+1);
			}
		}
		
		for(Integer key:map.keySet()) {
			int value=map.get(key);
			if(value==1) {
				System.out.println(key);
			}
		}
		
		
	}

}
