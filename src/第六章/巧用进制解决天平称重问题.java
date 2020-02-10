package 第六章;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 巧用进制解决天平称重问题 {

	
	/**
	 * 用天平称重时候，我们希望用尽可能少的砝码组合称出尽可能多的重量
	 * 如果有无限个砝码，但是他们的重量分别是1，3，9，27，81...等3的指数幂
	 * 神奇之处在于用它们组合可以称出任意整数重量（砝码允许放在左右两个盘子中）
	 * 本题目要求：对用户给定的重量，给出砝码组合方案，重量小于1000000
	 * 例如：
	 * 用户输入：
	 * 5
	 * 输出：
	 * 9-3-1
	 * 
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int N=input.nextInt();
		final String x=Integer.toString(N, 3);
		char[]arr=new StringBuilder(x).reverse().toString().toCharArray();
		List<Integer>list=new ArrayList<>();
		//list.add(index,element)方法会将element插入指定位置，且之后的元素都会向后移动一位
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='2') {
				list.add(0,-1);//插入第一位，方便后边计算，因为这里翻转了数组，5的三进制为21，翻转后是12，这里转换后又将其翻转回去
				if(i==arr.length-1) {
					list.add(0,1);
				}else {
					++arr[i+1];
				}
			}else if(arr[i]=='3') {//有可能连续两个2，则后一位会进位成3需要处理
				list.add(0,0);
				if(i==arr.length-1) {//如果是最后一位，则再补一位
					list.add(0,1);
				}else {
					++arr[i+1];//后一位加+1，进位
				}
			}else {
				list.add(0,arr[i]-'0');
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==1)sb.append("+").append((int)Math.pow(3, list.size()-i-1));
			if(list.get(i)==-1)sb.append("-").append((int)Math.pow(3, list.size()-i-1));
		}
		System.out.println(sb.substring(1));
		
		

	}

}
