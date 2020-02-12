package 第六章;

import java.util.Arrays;
import java.util.Scanner;

public class 阶梯博弈 {

	/**
	 * 
从左到右有一排石子，给出石子所在的位置。
规定每个石子只能向左移动，且不能跨过前面的石子。
最左边的石子最多只能移动到1位置。
每次选择一个石子按规则向左移动，问先手是否能赢。（赢得条件指对方无法再移动棋子）
bob和georgia，georgia先走
//此类输入要求，多组数据用二维数组存取，技巧，记住
	 * 输入：
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
		Scanner input =new Scanner(System.in);
		int caseNum=input.nextInt();
		int[][]data=new int[caseNum][];
		for(int i=0;i<caseNum;i++) {
			int k=input.nextInt();
			data[i]=new int[k];
			for(int j=0;j<k;j++) {
				data[i][j]=input.nextInt();
			}
		}
		
		for(int i=0;i<caseNum;i++) {
			String res=deal(data[i]);
			System.out.println(res);
		}

	}
	/**
	 * 
	 * 阶梯博弈转换成nim问题
	 * 异或结果为0先手输
	 * 不为0先手赢
	 * 
	 */
	public static String deal(int[]A) {
		int len=A.length;
		Arrays.sort(A);
		int res=0;
		if((len&1)==1) {//奇数
			for(int i=0;i<len;i+=2) {
				res^=(i==0)?(A[0]-1):(A[i]-A[i-1]-1);
			}
		}else {//偶数
			for(int i=1;i<len;i+=2) {
				res^=(A[i]-A[i-1]-1);
			}
		}
		if(res==0)return "Bob will win";
		else return "Georgia wll win";
	}

}
