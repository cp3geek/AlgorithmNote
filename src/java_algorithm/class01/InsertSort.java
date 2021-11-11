package java_algorithm.class01;

import java.util.Arrays;

public class InsertSort {



    public static void insertSort(int[]arr){
        if(arr.length<2||arr==null){
            return;
        }else{
            for(int i=1;i<arr.length;i++){//0-i上有序

                for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--){//j为当前数的前一个位置
                    swap(arr,j,j+1);
                }

            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={9,2,4,6,5,8,1,2,3};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
