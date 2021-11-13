package java_algorithm.class01;

import java.util.Arrays;

/**
 * 在一个数组中，左边的数如果比右边的数大，则这两个数构成一个逆序对，请打印所有的逆序对
 */

public class ReversePair {
    public static int sum;
    public static void reversePair(int arr[]){
        if(arr==null||arr.length<2)return;
        process(arr,0,arr.length-1);
    }

    private static void process(int[] arr, int l, int r) {
        if(l==r)return;
        int mid=l+((r-l)>>1);
        process(arr,l,mid);
        process(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[]help=new int[r-l+1];
        int i=0;
        int p1=l;
        int p2=mid+1;

        while(p1<=mid&&p2<=r){
            if(arr[p1]<arr[p2]){
                help[i++]=arr[p1++];
            }else{
                for(int x=p1;x<mid+1;x++) System.out.println("("+arr[x]+","+arr[p2]+")");
                sum+=mid+1-p1;

                help[i++]=arr[p2++];
            }
        }

        while(p1<=mid)help[i++]=arr[p1++];
        while(p2<=r)help[i++]=arr[p2++];
        for(i=0;i<help.length;i++)arr[l+i]=help[i];


    }

    public static void main(String[] args) {
        int[]arr={3,2,4,5,0};
        reversePair(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
