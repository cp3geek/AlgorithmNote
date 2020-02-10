package 第五章;

import java.util.Arrays;

import com.sun.javafx.scene.CameraHelper.CameraAccessor;
import 第五章.Suff;
public class 后缀数组 {

	/**
	 * 就是串得所有后缀子串按字典序排序后，在数组中记录后缀的起始下标
	 * 后缀数组就是：排名和原下标的映射 sa[0]=5,起始下标为5的后缀在所有后缀中字典序最小
	 *rank数组：给定后缀的下标，返回其字典序，rk[5]=0;
	 *
	 *子串：一定是某个后缀的前缀
	 */
	public static void main(String[] args) {
		match();

	}
	
	static void match() {
		String s="abababababb";
		String p="babb";
		Suff[]sa=getSa(s);
		int l=0;
		int r=s.length()-1;
		
		
		while(r>=l) {
			int mid=l+((r-l)>>1);
			//居中的后缀
			Suff midSuff=sa[mid];
			String suffStr=midSuff.str;
			int compareRes;
			if(suffStr.length()>=p.length()) {
				compareRes=suffStr.substring(0, p.length()).compareTo(p);
			}else {
				compareRes=suffStr.compareTo(p);
			}
			if(compareRes==0) {
				System.out.println(midSuff.index);
				break;
			}else if(compareRes<0) {
				l=mid+1;
			}else {
				r=mid-1;
			}
			
		}
		
		
	}
	
	public static Suff[] getSa(String src) {
		int strLength=src.length();
		Suff[]suffixArray=new Suff[strLength];
		for(int i=0;i<strLength;i++) {
			String suffI=src.substring(i);//从那个位置开始截取，前闭后开，相当于求前缀
			suffixArray[i]=new Suff(suffI,i);
		}
		Arrays.sort(suffixArray);
		return suffixArray;
	}
	
	

}
