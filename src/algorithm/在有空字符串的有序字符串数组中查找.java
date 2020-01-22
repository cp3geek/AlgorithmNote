package algorithm;

public class 在有空字符串的有序字符串数组中查找 {
	/**
	 * 
	 * 有个排序后的字符串数组，其中散布着一些空字符串，编写一个方法，找出给定的字符串（肯定不是空字符串的索引）
	 */
	public static void main(String[] args) {
		String[]arr= {"a","","ac","","ad","b","","ba"};
		int res=f(arr,"abc");
		System.out.println(res);
	}
	
	static int f(String[]arr,String p) {
		int begin=0;int end=arr.length-1;
		while(begin<=end) {
			int mid=begin+((end-begin)>>1);
			
			while(arr[mid].equals("")) {
				mid++;
				if(mid>end)return -1;
			}
			if(arr[mid].compareTo(p)>0)end=mid-1;
			else if(arr[mid].compareTo(p)<0)begin=mid+1;
			else return mid;
		}
		return -1;
	}

}
