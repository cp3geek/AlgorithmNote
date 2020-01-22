package algorithm;

public class 汉诺塔 {

	public static void main(String[] args) {
		f("a","b","c",2);

	}
	
	static void f(String from,String to,String help,int n) {
		if(n==1)System.out.println("将第"+n+"个盘子从"+from+"移动到"+to);
		else{
			f(from,help,to,n-1);
		System.out.println("将第"+n+"个盘子从"+from+"移动到"+to);//第n个盘子顺利到达目标
			f(help,to,from,n-1);
		}
		
	}

}
