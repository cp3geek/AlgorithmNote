package java_algorithm.class01;

import com.sun.scenario.effect.Merge;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[]arr){
        if(arr==null||arr.length<2)return;
        process(arr,0,arr.length-1);
    }

    public static void process(int[]arr,int l,int r){
        if(l==r)return;
        int mid=l+((r-l)>>1);
        process(arr,l,mid);
        process(arr,mid+1,r);
        merge(arr,l,mid,r);

    }
    public static void merge(int[]arr,int l,int m,int r){
        int[]help=new int[r-l+1];
        int i=0;
        int p1=l;
        int p2=m+1;
        while(p1<=m&&p2<=r)help[i++]=arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];//两边相等，先拷贝左边
        while(p1<=m)help[i++]=arr[p1++];
        while(p2<=r)help[i++]=arr[p2++];
        for(i=0;i<help.length;i++)arr[l+i]=help[i];

    }


    public static void main(String[] args) {
        int[]arr={2,6,7,1,3,4,9,10};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
