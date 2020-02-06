package 第五章;

public class 去掉连续出现的k个0 {

	/**
	 * 移除字符串中连续出现的k个0
	 * 1001---11//k取2
	 * 10001----101//k取2
	 * 
	 * 可以用扫描字符数组的方法，但是正则表达式更快
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(delete0("1000001",2));
		System.out.println(remove("101",2));

	}
	
	
	static String delete0(String str,int k) {
		char[]arr=str.toCharArray();
		int count=0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			char c=arr[i];
			if(c=='0')count++;
			else {
				for(int j=0;j<count%k;j++)
					sb.append('0');//一次结算完了
				sb.append(c);
				count=0;//置为0
			}
			
		}
		return sb.toString();
	}
	
	
	
	
	
	//0{3},代表连续三个0
	static String remove(String str,int k) {
		String regexp="0{"+k+"}";
		return str.replaceAll(regexp, "");//将0替换成空白
	}

}
