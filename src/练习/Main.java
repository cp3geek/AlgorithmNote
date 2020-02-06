package 练习;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		int N=input.nextInt();
		int k=input.nextInt();
		
		int[][]matrix=new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				matrix[i][j]=input.nextInt();
			}
		}
		
		
	}
	
	static void print(int[][]matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	

}
