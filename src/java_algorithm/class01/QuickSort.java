package java_algorithm.class01;

import java.util.Arrays;

/**
 * 问题一：给定一个数组arr，和一个数组num，请把小于等于num的数放在数组的左边，大于num的数放在数组的右边。
 * 要求额外空间复杂度O（1）时间复杂度度O（N）
 * 问题二：（荷兰国旗问题）
 * 给定一个数组arr，和一个数num，请把小于num的数放在数组的左边，等于num的数放在数组的中间，大于num的数放在数组的右边
 * 要求额外空间复杂度O（1）时间复杂度O（N）
 *
 * 两个问题引出快排思想
 */
public class QuickSort {
    public static void quickSort(int[]arr){
        if(arr==null&&arr.length<2)return;
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if(l<r){
            swap(arr,l+(int)(Math.random()*(r-l+1)),r);//等概率随机选一个位置，把它跟最右边位置交换
            int[]p=patition(arr,l,r);
            quickSort(arr,l,p[0]-1);//<区
            quickSort(arr,p[1]+1,r);//>区
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    /**
     *这是一个处理arr[l...r]的函数
     * 默认以arr[r]做划分
     * 返回等于区域（左边界，右边界），所以返回一个长度为2的数组res
     */
    private static int[] patition(int[] arr, int l, int r) {
        int less =l-1;//<区右边界
        int more=r;//>区左边界
        while(l<more){//l表示当前数的位置
            if(arr[l]<arr[r])swap(arr,++less,l++);//当前数小于划分值
            else if(arr[l]>arr[r])swap(arr,--more,l);//当前数大于划分值
            else l++;
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }

    public static void main(String[] args) {
        int[]arr={1,6,8,4,5,6,9,1,5,4,3,2,1,10};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
