package algorithm;

public class 字符串反转 {

	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder("abcd");
		
		System.out.println(builder.reverse());
		System.out.println(reverse("dgfhn", 4));
	}
	
	//递归解法
	static String reverse(String src,int end) {
		if(end==0)return ""+src.charAt(0);
		return src.charAt(end)+reverse(src, end-1);
	}

}
