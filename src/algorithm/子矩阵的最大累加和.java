package algorithm;

import java.util.Arrays;

public class 子矩阵的最大累加和 {

	/**
	 * 给定一个矩阵：其中的值有正，有负，有0，返回子矩阵的最大累加和
	 * 例如：-1 -1 -1
	 *     -1  2  2
	 *     -1 -1 -1
	 * 其中最大子矩阵累加和为 2 2 则返回4
	 */
	public static void main(String[] args) {
		int[][]matrix= {
				{-90,48,78},
				{64, -40, 64},
				{-81,-7,66}
				};
		System.out.println(f(matrix));

	}
	
	//结合求子数组的最大累加和，从第一行开始累加，压缩成一维数组，再求其累加和，最大的保留；
	//以每一行为子矩阵头来求，压缩数组，123，23，3；
	static int f(int[][]matrix) {
		int beginRow=0;
		int m=matrix.length;int n=matrix[0].length;
		int[]sums=new int[n];//按列求和
		int max=0;
		while(beginRow<m) {
			for(int i=beginRow;i<m;i++) {
				for(int j=0;j<n;j++) {
					sums[j]+=matrix[i][j];
				}//累加完成，得到该数组
				int t=f1(sums);//求该数组的最大子数组累加和
				if(t>max)max=t;
			}
			Arrays.fill(sums, 0);//将数组清零
			beginRow++;//另起一行
		}
		return max;
	}
	//arr={1,-2,3,5,-2,6,-1}所有子数组中[3,5,-2,6]可以累加出最大的和12，所以返回12
	static int f1(int[]arr) {
		int sumj=0;
		int max=sumj;
		
		for(int i=0;i<arr.length;i++) {
			if(sumj>=0) sumj+=arr[i];
			else sumj=arr[i];
			
			if(sumj>max)max=sumj;
		}
		return max;
	}

}
