package algorithm;

public class Z型打印二维数组 {

	public static void main(String[] args) {
		int[][] matrix= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		print(matrix);

	}
	static void print(int[][]matrix) {
		int r=0;int c=0;int m=matrix.length;int n=matrix[0].length;
		boolean l2r=true;//从左往右;
		while(r<m&&c<n) {
			//从左下到右上的斜线
			if(l2r) {
				System.out.print(matrix[r][c]+" ");
				if(r==0&&c<n-1) {
					l2r=!l2r;
					c++;
					continue;
				}else if(r>0&&c==n-1) {
					l2r=!l2r;
					r++;
					continue;
				}else {
					r--;
					c++;
				}
			}else {
				System.out.print(matrix[r][c]+" ");
				if(c==0&&r<m-1) {
					l2r=!l2r;
					r++;
					continue;
				}else if(r==m-1) {
					l2r=!l2r;
					c++;
					continue;
				}else {
					r++;
					c--;
				}
			}
		}
	}

}
