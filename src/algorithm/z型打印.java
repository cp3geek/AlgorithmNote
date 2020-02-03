package algorithm;

public class z型打印 {

	public static void main(String[] args) {
		int[][] matrix= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		print(matrix);
	}
	
	static void print(int[][]matrix) {
		int r=0;int c=0;int m=matrix.length-1;int n=matrix[0].length-1;
		boolean l2r=true;//从左往右打
		
		
		while(r<=m&&c<=n) {
			if(l2r) {
				System.out.print(matrix[r][c]+" ");
				if(r==0&&c<=n) {
					l2r=!l2r;
					c++;
					continue;
				}
				else if(c==n&&r<=m) {
					l2r=!l2r;
					r++;
					continue;
				}
				else {
					r--;
					c++;
				}
				
			}else {
				System.out.print(matrix[r][c]+" ");
				if(c==0&&r<=m) {
					l2r=!l2r;
					r++;
					continue;
				}
				else if(r==m&&c<=n) {
					l2r=!l2r;
					c++;
					continue;
				}
				else {
					r++;
					c--;
				}
			}
			
		}
	}

}
