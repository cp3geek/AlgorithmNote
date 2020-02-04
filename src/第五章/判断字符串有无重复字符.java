package 第五章;


/**
 * 
 * 实现一个算法，确定一个字符串中的所有字符是否全部不同。假使不允许使用额外的数据结构，又该如何处理
 *
 */
public class 判断字符串有无重复字符 {
	public static void main(String[] args) {
		String str="acx";
		System.out.println(f(str));
	}
	
	//如果不闲置空间，则可以开辟辅助数组，数字转下标，记录每一个字符出现的次数
	
	static boolean f(String str) {
		
		int[]flag=new int[128];//ASCII码，128个
		
		for(int i=0;i<str.length();i++) {
			int c=(int)(str.charAt(i));
			if(flag[c]>0) return false;
			else flag[c]++;
			
		}
		
		
		return true;
	}
}
