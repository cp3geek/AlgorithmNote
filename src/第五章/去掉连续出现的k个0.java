package 第五章;

public class 去掉连续出现的k个0 {

	/**
	 * 移除字符串中连续出现的k个0
	 * 1001---11
	 * 10001----11
	 * 
	 * 可以用扫描字符数组的方法，但是正则表达式更快
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(delete0("1001"));
		System.out.println(remove("1001",2));

	}
	static String delete0(String str) {
		char[]charArray=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!='0')sb.append(charArray[i]);
		}
		
		return sb.toString();
	}
	//0{3},代表三个0
	static String remove(String str,int k) {
		String regexp="0{"+k+"}";
		return str.replaceAll(regexp, "");//将0替换成空白
	}

}
