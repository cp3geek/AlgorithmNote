package 第六章;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 蓝桥杯原题_高僧斗法 {
/*
节目大略步骤为：先用粮食（一般是稻米）
在地上“画”出若干级台阶（表示N级浮屠）。
又有若干小和尚随机地“站”在某个台阶上。最高一级台阶必须站人，其它任意。(如图1所示)
两位参加游戏的法师分别指挥某个小和尚向上走任意多级的台阶，
但会被站在高级台阶上的小和尚阻挡，不能越过。两个小和尚也不能站在同一台阶，也不能向低级台阶移动。
两法师轮流发出指令，最后所有小和尚必然会都挤在高段台阶，
再也不能向上移动。轮到哪个法师指挥时无法继续移动，则游戏结束，该法师认输。
对于已知的台阶数和小和尚的分布位置，请你计算先发指令的法师该如何决策才能保证胜出。
输入数据为一行用空格分开的N个整数，
表示小和尚的位置。台阶序号从1算起，所以最后一个小和尚的位置即是台阶的总数。
（N<100,台阶总数<1000）
输出为一行用空格分开的两个整数: A B, 表示把A位置的小和尚移动到B位置。
若有多个解，输出A值较小的解，若无解则输出-1。
例如：
用户输入：
1 5 9
则程序输出：
1 4
再如：
用户输入：
1 5 8 10
则程序输出：
1 3
资源约定：
峰值内存消耗 < 64M
CPU消耗 < 1000ms
	 * 
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String[]s=input.nextLine().split(" ");
		int[]data=new int[s.length];
		
		for(int i=0;i<s.length;i++) {
			data[i]=Integer.parseInt(s[i]);
		}
		deal(data);
		


	}
	public static boolean fun(int[]a) {
		int sum=0;
		for(int i=0;i<a.length-1;i+=2) {
			sum^=(a[i+1]-a[i]-1);
		}
		return sum==0;
	}
	
	public static void deal(int[]a) {
		int len=a.length;
		int res=0;
		if((len&1)==1) {
			for(int i=0;i<len;i+=2) {
				res^=(i==0)?(a[0]-1):(a[i]-a[i-1]-1);
			}
		}else {
			for(int i=1;i<len;i+=2) {
				res^=(a[i]-a[i-1]-1);
			}
		}
		//转换成nim博弈
		if(res==0) System.out.println(-1);//如果==0，则先手必输，无解
		else {
			//必赢操作，从第一个小和尚开始枚举
			for(int i=0;i<len-1;i++) {
				//最后一个数为顶点，所以不用遍历到最后一个数
				for(int j=1;a[i]+j<a[i+1];j++) {//前一个小和尚不能越过后一个小和尚
					int temp=a[i];//临时变量，方便后面回溯
					a[i]+=j;
					if(fun(a)) {//重新计算异或值，若为0，必胜操作，因为先手需要将当前状态转换成输得状态
						System.out.println(temp+" "+a[i]);
						//必赢操作，输出
						break;
					}
					a[i]=temp;//回溯
				}
				
			}
			
			
	}

	}
}
