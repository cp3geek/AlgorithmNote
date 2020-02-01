package algorithm;

public class 发帖水王 {

	/**
	 * 水王发帖数目超过了帖子总数得一半。如果你有一个当前论坛上所以得帖子（包括回帖）得列表
	 * ，其中帖子作者得id也在里面，你能快速找出这个水王吗？
	 * 
	 */
	public static void main(String[] args) {
		int[]arr= {1,2,3,5,6,7,8,6,6,6};
		f(arr);

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

}
