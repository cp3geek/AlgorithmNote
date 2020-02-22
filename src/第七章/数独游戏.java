package 第七章;

import java.util.Scanner;

public class 数独游戏 {
	
	/**
	 * 玩家需要根据9x9盘面上的已知数字，推理出所有剩余空格的数字，并满足每一行
	 * 每一列，每一个同色的九宫格内的数字均含1-9，不重复。
	 * 数独的答案是唯一的，所以多个解也称为无解
	 * 本图的数字据说是芬兰学家花了三个月的时间设计出来的较难的题目。
	 * 但是
	 * 对于会使用计算机编程的你来说，简直易如反掌
	 * 本题的要求就是输入数独题目，程序输出数独的唯一解。
	 * 我们保证所有已知数据的格式都是合法的，并且题目有唯一的解
	 * 格式要求，输入9行，每行9个数字，0代表未知，其他数字已知
	 * 输出9行，每行9个数字表示数独的解
	 * 
	 * 输入：
	 * 005300000
	 * 800000020
	 * 070010500
	 * 400005300
	 * 010070006
	 * 003200080
	 * 060500009
	 * 004000030
	 * 000009700
	 * 
	 * 
	 * 程序应该输出：
	 * 	145327698
		839654127
		672918543
		496185372
		218473956
		753296481
		367542819
		984761235
		521839764
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		char[][]table =new char[9][];
		for(int i=0;i<9;i++) {
			table[i]=input.nextLine().toCharArray();
		}
		dfs(table,0,0);

	}
	public static void dfs(char[][]table,int x,int y) {
		if(x==9) {
			print(table);
			System.exit(0);
		}
		if(table[x][y]=='0') {
			for(int i=1;i<=9;i++) {
				if(check(table,x,y,i)) {
					table[x][y]=(char)(i+'0');
					dfs(table,x+(y+1)/9,(y+1)%9);
				}
			}
			table[x][y]='0';
			
		}else {
			dfs(table,x+(y+1)/9,(y+1)%9);
		}
	}
	private static boolean check(char[][] table, int i, int j, int k) {
		for(int l=0;l<9;l++) {
			if(table[i][l]==(char)('0'+k))return false;
			if(table[l][j]==(char)('0'+k))return false;
		}
		
		for(int l=(i/3)*3;l<(i/3+1)*3;l++) {
			for(int m=(j/3)*3;m<(j/3+1)*3;m++) {
				if(table[l][m]==(char)('0'+k))return false;
			}
		}
		
		return true;
	}
	private static void print(char[][] table) {
		for(int i=0;i<table.length;i++) {
			System.out.println(new String(table[i]));
		}
		
	}
	

}
