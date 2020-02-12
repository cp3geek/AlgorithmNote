package 练习;

import java.util.Scanner;

public class Bob_and_Georgia {

	/**
	 * * 输入：
	 * 2//测试得组数
	 * 3//该组得个数
	 * 1 2 3//数据
	 * 8
	 * 1 5 6 7 9 12 14 17 
	 *输出：
	 *bob will win
	 *georgia will win
	 */
	 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int caseNum=input.nextInt();
		int[][]data=new int[caseNum][];
		for(int i=0;i<caseNum;i++) {
			int k=input.nextInt();
			data[i]=new int[k];
			for(int j=0;j<k;j++) {
				data[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<caseNum;i++){
			String res=deal(data[i]);
			System.out.println(res);
		}

	}

	private static String deal(int[] a) {
		int len=a.length;
		int res=0;
		if((len&1)==1) {
			for(int i=0;i<len;i+=2) {
				res^=(i==0)?a[i]:(a[i]-a[i-1]);
			}
		}else {
			for(int i=1;i<len;i+=2) {
				res^=(a[i]-a[i-1]);
			}
		}
		if(res==0)return "Bob will win";
		else return "Georgia will win";
		
	}

}
