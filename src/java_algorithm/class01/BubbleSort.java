package java_algorithm.class01;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }else{
            for(int e= arr.length-1;e>0;e--){
                for(int i=0;i<e;i++){
                    if(arr[i]>arr[i+1])
                        swap(arr,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }


    public static void main(String[] args) {
        int[] arr={2,5,1,3,8,4,6,9,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
