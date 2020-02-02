package algorithm;

public class 顺序打印二维数组 {

	public static void main(String[] args) {
		int[][]matrix= {
				{1,2,3,4,101},
				{5,6,7,8,102},
				{9,10,11,12,103},
				{13,14,15,16,104},
				{17,18,19,20,105}
				};
		print(matrix);

	}
	
	static void print(int[][] matrix) {
		int leftUpRow=0;int leftUpCol=0;
		int rightDownRow=matrix.length-1;
		int rightDownCol=matrix[0].length-1;
		
		
		while(leftUpCol<=rightDownCol&&leftUpRow<=rightDownRow) {
		int r=leftUpRow;int c=leftUpCol;
		while(c<=rightDownCol)System.out.print(matrix[r][c++]+" ");
		c=rightDownCol;
		r++;
		
		while(r<=rightDownRow)System.out.print(matrix[r++][c]+" ");
		r=rightDownRow;
		c--;
		
		while(c>=leftUpCol)System.out.print(matrix[r][c--]+" ");
		c=leftUpCol;
		r--;
		while(r>leftUpRow)System.out.print(matrix[r--][c]+" ");
		
		
		leftUpRow++;leftUpCol++;rightDownRow--;rightDownCol--;
		
		}
	}

}
