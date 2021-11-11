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
        //异或：不同为1，相同为0
        /*
        * 1）0^N=N,N^N=0
        * 2）异或运算满足交换律和结合律 a^b=b^a,a^b^c=a^(b^c)
        *同一批数异或，结果与谁跟谁先异或无关，一定相同
        * a=甲，b=乙
        * a=a^b     a=甲^乙，b=乙
        * b=a^b     b=甲^乙^乙=甲^0=甲，a=甲^乙
        * a=a^b     a=甲^乙^甲=（甲^甲）^乙=乙，b=甲
        * a=乙，b=甲
        * */
    }


    public static void main(String[] args) {
        int[] arr={2,5,1,3,8,4,6,9,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
