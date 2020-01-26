package algorithm;

public class MergeSort {

	public static int[] help;
	public static void main(String[] args) {
		int[]a= {5,6,4,1,2,3,8,10,25,14};
		sort(a);
		for(int i:a)System.out.print(i+" ");

	}
	
	public static void sort(int[]arr) {
		help=new int[arr.length];
		sort(arr,0,arr.length-1);
	}
	public static void sort(int[]arr,int p,int r) {
		if(p<r) {
			int mid=p+((r-p)>>1);
			sort(arr,p,mid);
			sort(arr,mid+1,r);
			merge(arr,p,mid,r);
		}
		
	}

	private static void merge(int[] arr, int p, int mid, int r) {
		System.arraycopy(arr, p, help, p, r-p+1);
		int left=p;
		int right=mid+1;
		int current=p;
		
		while(left<=mid&&right<=r) {
			if(help[left]<help[right])arr[current++]=help[left++];
			else arr[current++]=help[right++];
		}
		while(left<=mid)arr[current++]=help[left++];
		
	}

}
