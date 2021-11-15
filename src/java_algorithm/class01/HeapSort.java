package java_algorithm.class01;

public class HeapSort {
    public static void main(String[] args) {

    }

    //某个数在index位置，能否往下移动
    public static void heapify(int[]arr,int index,int heapSize){
        int left=index*2+1;//左孩子下标
        while(left<heapSize){//下方还有孩子的时候
            //两个孩子中，谁的值大，就把下标给largest
            int largest=left+1<heapSize&&arr[left+1]>arr[left]?left+1:left;
            //父和孩子之间，谁的值大，把下标给largest
            largest=arr[largest]>arr[index]?largest:index;
            if(largest==index)break;

            swap(arr,largest,index);
            index=largest;
            left=index*2+1;

        }
    }

    //某个数现在处于index位置，往上继续移动
    public static void heapInsert(int[]arr,int index){
        while(arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index=(index-1)/2;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
