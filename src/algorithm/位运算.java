package algorithm;

public class 位运算 {

	
	public static void main(String[] args) {
		
		
		int a=1;
		if(((a-1)&a)==0)System.out.println("是2的整次幂");
		else System.out.println("不是");
		int w=0;
		for(int i=0;i<32;i++) {
			
			if(((a>>i)&1)==1)
				w=i;
		}
		
		
		System.out.println("是2的"+w+"次方");
		
		
	}

}
