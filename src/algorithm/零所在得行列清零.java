package algorithm;

public class 零所在得行列清零 {

	public static void main(String[] args) {
		int[][] matrix= {
				{1,2,3,4},
				{5,6,0,8},
				{9,0,11,12},
				{13,14,15,16}
				};
		print(matrix);
		
		
	}
	
	static void print(int[][]matrix) {
		int m=matrix.length;//行
		int n=matrix[0].length;//列
		
		int[]rowRecord=new int[m];
		int[]colRecord=new int[n];
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]==0) {
					rowRecord[i]=1;
					colRecord[j]=1;
				}
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(rowRecord[i]==1||colRecord[j]==1) {
					matrix[i][j]=0;
				}
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
		}
		
	}

}
