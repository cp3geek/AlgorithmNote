package algorithm;

public class 浮点数的二进制表示 {

	public static void main(String[] args) {
		double a=0.3;
		
		StringBuilder builder=new StringBuilder("0.");
		
		while(a>0) {
			a=a*2;
			if(a>=1) {
				builder.append("1");
				a=a-1;
				}else {
					builder.append("0");
				}
		}
		System.out.println(builder.toString());
		

	}

}
