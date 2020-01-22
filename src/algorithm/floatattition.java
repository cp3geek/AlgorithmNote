package algorithm;

public class floatattition {

	public static void main(String[] args) {
		
		//浮点数最好不要用全等符号，相减判断绝对值小于某一个数，例如1E-10
		/*
		 * for(int i=0;i<100;i++) for(int j=0;j<100;j++) { if(2.3*i+1.9*j==82.3)
		 * System.out.println(i+"+"+j); }
		 */

		//可以扩大10倍转换成整数
		for(int a=0;a<50;a++) 
			for(int b=1;b<50;b++) {
				if(a*23+b*19==823)
					if(a<b)
					System.out.println(a+"+"+b);
			}
		
		
		
	}

}
