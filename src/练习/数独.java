package 练习;

import java.util.Scanner;

public class 数独 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[][]table=new char[9][];
		for(int i=0;i<9;i++) {
			table[i]=sc.nextLine().toCharArray();
		}
		dfs(table,0,0);
		
	}
	public static void dfs(char[][]table,int x,int y) {
		if(x==9) {
			print(table);
			System.exit(0);
		}
		if(table[x][y]=='0') {
			for(int i=1;i<10;i++) {
				if(check(table,x,y,i)) {
					table[x][y]=(char)('0'+i);
					dfs(table,x+(y+1)/9,(y+1)%9);
				}
			}
			table[x][y]='0';
		}else {
			dfs(table,x+(y+1)/9,(y+1)%9);
		}
	}
	private static void print(char[][] table) {
		for(int i=0;i<9;i++) {
			System.out.println(new String(table[i]));
		}
		
	}
	private static boolean check(char[][] table, int x, int y, int i) {
		for(int k=0;k<9;k++) {
			if(table[x][k]==(char)('0'+i))return false;
			if(table[k][y]==(char)('0'+i))return false;
		}
		for(int m=(x/3)*3;m<(x/3+1)*3;m++) {
			for(int n=(y/3)*3;n<(y/3+1)*3;n++) {
				if(table[m][n]==(char)('0'+i))return false;
			}
		}
		
		
		return true;
	}
	

}
