package 第五章;

public class 字符串匹配之KMP {

	public static void main(String[] args) {
		String s="hahaha";
		String p="ha";
		System.out.println(indexOf1(s, p));

	}
	
	static int indexOf1(String s,String p) {
		if(s.length()==0||p.length()==0)return -1;
		if(p.length()>s.length())return -1;
		int[]next=next(p);
		int i=0;//s的位置
		int j=0;//p的位置
		int sLen=s.length();
		int pLen=p.length();
		
		while(i<sLen) {
			//如果j==-1,或者当前字符匹配成功，令i++,j++;
			//j=-1,因为next[0]=-1,说明p的第一位h和i的位置无法匹配，这时候i,j都增加1，i移位j从0开始
			if(j==-1||s.charAt(i)==p.charAt(j)) {
				i++;
				j++;
			}else {
				//如果j!=-1,且当前字符匹配失败，则令i不变，j=next[j]
				//next[j]则为j所对应的next值
				j=next[j];
			}
			if(j==pLen) {
				return (i-j);
			}
		}
		return -1;
	}
/**
 * 字符串:bread
 * 前缀:b,br,bre,brea
 * 后缀:read,ead,ad,d 
 * 然后next数组是求最大匹配得串
 * 
 *
 * "前缀"指除了最后一个字符以外，一个字符串的全部头部组合；
 * "后缀"指除了第一个字符以外，一个字符串的全部尾部组合。
 */
	
	/**
	 * babab b
	 *前缀：b,ba,bab,baba,babab
	 *后缀：abab,bab,ab,b
	 *所以第6位得next数组中得值为3，因为前五位前缀后缀最大匹配串是bab 3位
	 * 
	 */
	//递推求next数组
	/**
	 * 求该数组不可能每个子串得前缀后缀都去比较
	 * 所以要逆推
	 * 
	 * 
	 */
	private static int[] next(String ps) {
		int pLength=ps.length();
		int[]next=new int[pLength];
		char[]p=ps.toCharArray();
		next[0]=-1;
		if(ps.length()==1)return next;
		
		next[1]=0;
		int j=1;
		int k=next[j];//看位置j得最长匹配前缀在哪里
		while(j<pLength-1) {
			//现在要推出next[j+1],检查j和k位置上得关系即可
			if(k<0||p[j]==p[k]) {
				next[++j]=++k;
			}else {
				k=next[k];
			}
		}
		return next;
	}

}
