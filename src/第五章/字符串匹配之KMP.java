package 第五章;

public class 字符串匹配之KMP {

	public static void main(String[] args) {
		String s="babababcbabababb";
		String p="babababb";

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

}
