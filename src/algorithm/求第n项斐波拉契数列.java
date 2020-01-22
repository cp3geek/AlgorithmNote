package algorithm;

public class 求第n项斐波拉契数列 {

	public static void main(String[] args) {
//		int n=10;
//		for(int i=1;i<=n;i++) {
//			System.out.println(f(i)+" ");
//		}
		
		
		//迭代求斐波拉契数列
		
		System.out.println(f2(1));
		System.out.println(fibonacciSum(5));
	}
	//时间复杂度为o（n²）
	static int f(int n) {
		
		if(n<=2)return 1;
		return f(n-1)+f(n-2);
	}
	static int f2(int n) {
		int f1=1,f2=1;
		int fn=0;
		if(n<=2)fn=1;
		for(int i=3;i<=n;i++) {
			int temp=f2;
			fn=f1+f2;
			f2=fn;
			f1=temp;
		}
		return fn;
	}
	static int fibonacciSum(int n){
        return f(n+2) - 1;
    }
	
	
	

}
