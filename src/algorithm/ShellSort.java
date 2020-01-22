package algorithm;

public class ShellSort {

	public static void main(String[] args) {
		int arr[]= {4,2,3,6,9,8,10,22,11,24,12,13,5,6,9,1,2,3,4,85,65,42,32,12,45};
		f(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}
	
	static void f(int[]arr) {
		for(int interval=arr.length/2;interval>0;interval/=2) {
			
			//i++和i+=interval区别在于，后者将一组排序完再改变增量，前者排序每一组的前两个元素，再排序后面
			for(int i=interval;i<arr.length;i++) {
				int target=arr[i];
				int j=i-interval;
				while(j>-1&&arr[j]>target) {
					arr[j+interval]=arr[j];
					j=j-interval;
				}
				arr[j+interval]=target;
			}
			
			
			
			
		}
		
		
	}

}
