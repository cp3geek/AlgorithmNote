package algorithm;

public class 矩阵运算 {

	public static void main(String[] args) {
		int[][]a= {
				{1,2,3},
				{1,2,3},
		};
		int[][]b= {
				{1,2},
				{1,2},
				{1,2}
		};
		
		int[][]newm=f(a,b);
		
		for(int[]i:newm) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	static int[][] f(int[][]a,int[][]b){
		int m=a.length;
		int n=a[0].length;
		int N=b[0].length;
		int[][]newMatrix=new int[m][N];
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<n;k++) {
					newMatrix[i][j]=a[i][k]*b[k][j]+newMatrix[i][j];
				}
			}
		}
		
		return newMatrix;
		
		
	}

}
