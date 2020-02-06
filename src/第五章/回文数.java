package 第五章;

public class 回文数 {

	/**
	 * 1221是一个非常特殊的数，它从左边读和右边读是一样的
	 * 编程求出所有这样的四位十进制数；
	 * 
	 */
	public static void main(String[] args) {
	f();	

	}
	
	static void f() {
		
		
		for(Integer i=1000;i<10000;i++) {
			StringBuilder sb=new StringBuilder(i.toString());
			if(i.toString().equals(sb.reverse().toString())) 
				System.out.println(i);
		}
		
		
	}

}
