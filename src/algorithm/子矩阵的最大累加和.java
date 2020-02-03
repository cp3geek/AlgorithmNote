package algorithm;

public class 子矩阵的最大累加和 {

	/**
	 * 给定一个矩阵：其中的值有正，有负，有0，返回子矩阵的最大累加和
	 * 例如：-1 -1 -1
	 *     -1  2  2
	 *     -1 -1 -1
	 * 
	 */
	public static void main(String[] args) {
		int[][]matrix= {
				{-1,-1,-1},
				{-1, 2, 2},
				{-1,-1,-1}
				};

	}
	
	//结合求子数组的最大累加和，从第一行开始累加，压缩成一维数组，再求其累加和，最大的保留；
	static int f(int[][]matrix) {
		int beginRow=0;
		int m=matrix.length;int n=matrix[0].length;
		int[]sums=new int[n];
		while(beginRow<m) {
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					sums[j]+=matrix[i][j];
				}
			}
			
			
			
			
		}
		return 0;
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
