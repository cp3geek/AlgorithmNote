package algorithm;

public class 找出边界为1的最大子方阵 {

	public static void main(String[] args) {
		int[][]A= {
				{1,1,1,1},
				{1,1,0,0},
				{1,1,1,1},
				{1,1,1,1}
				};
		System.out.println(f(A));
		
	}
	static int f(int[][]A) {
		int N=A.length;
		int n=N;
		
		while(n>0) {
			
			for(int i=0;i<N;i++) {
				if(i+n>N)break;
				l3:
				for(int j=0;j<N;j++) {
					if(j+n>N)break;
					int r=i;
					int c=j;
					
					//上
					while(c<j+n) if(A[r][c]==0)continue l3;
					else c++;
					c--;
					//下
					while(r<i+n)if(A[r][c]==0)continue l3;
					else r++;
					r--;
					//左
					while(c>=j)if(A[r][c]==0)continue l3;
					else c--;
					c++;
					//右
					while(r>=i)if(A[r][c]==0)continue l3;
					else r--;
					r++;
					
					return n;
				}
			}
			
			
			n--;
		}
		
		return 1;
		
	}

}
