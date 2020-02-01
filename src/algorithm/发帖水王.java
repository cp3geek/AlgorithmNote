package algorithm;

public class 发帖水王 {

	/**
	 * 水王发帖数目超过了帖子总数得一半。如果你有一个当前论坛上所以得帖子（包括回帖）得列表
	 * ，其中帖子作者得id也在里面，你能快速找出这个水王吗？
	 * 
	 */
	public static void main(String[] args) {
		int[]arr= {1,8,2,8,3,8,4,8};
		f(arr);
		f2(arr);

	}
	//不同得数进行消除  o(n)
	//1 8 2 8 3 8 4 8 8,1 2 3 4 5 8 8 8 8 8 8;
	public static void f(int[]arr) {
		
		int candidate=arr[0];//候选键
		int nTime=1;//出现得次数
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==candidate) {
				nTime++;//如果后面得数跟前面得相等就加1
			}else {
				nTime--;
				}
			if(nTime==0) {
				candidate=arr[i];//不同数抵消之后，候选键赋值给下一个元素
				nTime=1;//次数置为1
				
			}
		}
		System.out.println(candidate);
	}

	
	//变化,出现得次数恰好为个数得一半
	/**
	 * 水王占总数得一半，那帖子总数必为偶数，会有两种情况
	 * a 1 a 2 a 3 a 4；
	 * 1 a 2 a 3 a 4 a；
	 */
	
	public static void f2(int[]arr) {
		int candidate=arr[0];
		int nTime=1;
		int countOfLast=0;//记录最后一个数出现得次数，
		//因为找出现一半得数，必然最后会消减为0，有上诉两种情况
		//如果最后一个数为要找得数，则直接输出候选键
		//若倒数第二个数为要找得数，但是之前已经被抵消，会出错，所以
		//需要记录
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[arr.length-1])countOfLast++;
			
			if(nTime==0) {
				candidate=arr[i];
				nTime=1;
				continue;
			}
			
			if(arr[i]==candidate)nTime++;
			else nTime--;
		}
		if(countOfLast==arr.length/2)System.out.println(arr[arr.length-1]);
		else System.out.println(candidate);
	}
}
