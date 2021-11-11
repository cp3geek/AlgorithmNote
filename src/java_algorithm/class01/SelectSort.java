package java_algorithm.class01;

import java.util.Arrays;

public class SelectSort {

    public static void SelectSort(int[] arr){
        if(arr.length<2||arr==null){
            return;
        }else {
            for(int i=0;i<arr.length-1;i++){
                int MinIndex=i;
                for(int j=i+1;j<arr.length;j++){
                    MinIndex=arr[j]<arr[MinIndex]?j:MinIndex;
                }
                swap(arr,i,MinIndex);
            }
        }
        }

    private static void swap(int[] arr, int i, int j) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }






    public static void main(String[] args) {
        int[]arr={5,2,1,3,9,8,4,7,10};
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
