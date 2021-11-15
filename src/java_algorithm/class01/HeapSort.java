package java_algorithm.class01;

public class HeapSort {
    public static void main(String[] args) {

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
