package algorithm;

public class QuickSort {

	public static void main(String[] args) {
		int[]a= {5,6,4,1,2,3,8,10,25,14};
		quicksort(a, 0, a.length-1);
		for(int i:a)System.out.print(i+" ");
		

	}
	
	public static void quicksort(int[]a,int p,int r){

        if(p<r){
            int q=partition(a,p,r);
            quicksort(a,p,q-1);
            quicksort(a,q+1,r);
        }
    }
	
	public static int partition(int[] a, int p, int r) {
		int primary=a[p];
		int left=p+1;
		int right=r;
		
		while(left<=right) {
			while(left<=right&&a[left]<=primary) left++;
			while(left<=right&&a[right]>=primary) right--;
			if(left<right)swap(a, left, right);//&&为短路运算
			//当第一个表达式为假则不会计算第二个，整个表达式为假
			//这里前提left和right未相遇，所以left<=right需先判断
		}
		
		swap(a,p,right);
		
		return right;
	}

	static int[] swap(int[]a,int i,int j) {
		int k=a[i];a[i]=a[j];a[j]=k;
		return a;
	}

}
