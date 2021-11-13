package java_algorithm.class01;

import com.sun.scenario.effect.Merge;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[]arr){
        if(arr==null||arr.length<2)return;
        process(arr,0,arr.length-1);
    }

    public static void process(int[]arr,int L,int R){
        if(L==R)return;
        int mid=L+((R-L)>>1);
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);


    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] help=new int[r-l+1];
        int i=0;
        int p1=l;
        int p2=mid+1;
        while(p1<=mid&&p2<=r){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=mid)help[i++]=arr[p1++];
        while(p2<=r)help[i++]=arr[p2++];
        for(i=0;i<help.length;i++)arr[l+i]=help[i];

    }


    public static void main(String[] args) {
        int[]arr={2,6,7,1,3,4,9,10};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
