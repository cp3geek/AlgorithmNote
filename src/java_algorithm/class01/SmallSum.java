package java_algorithm.class01;

/**
 * 在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组的小和。求一个数组的小和
 *
 * 例子：[1,3,4,2,5]中1左边比1小的数，没有；3左边比3小的数，1；4左边比4小的数，1，3；2左边比2小的数，1；
 * 5左边比5小的数，1，3，4，2；所以小和为1+1+3+1+1+3+4+2=16
 */
public class SmallSum {

    public static int smallSum(int[]arr){
        if(arr==null||arr.length<2)return 0;

        return process(arr,0,arr.length-1);
    }
    //在L....R范围上既要排好序也要求小和
    private static int process(int[] arr, int l, int r) {
        if(l==r)return 0;
        int mid=l+((r-l)>>1);
        return process(arr,l,mid)+process(arr,mid+1,r)+merge(arr,l,mid,r);


    }

    private static int merge(int[] arr, int l, int mid, int r) {
        int[]help=new int[r-l+1];
        int i=0;
        int p1=l;
        int p2=mid+1;
        int res=0;

        while(p1<=mid&&p2<=r){
            res+=arr[p1]<arr[p2]?(r-p2+1)*arr[p1]:0;
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];//严格小于，意思是两边数相等先拷贝右边，这样才知道右边有多少数比左边大
        }
        while(p1<=mid)help[i++]=arr[p1++];
        while(p2<=r)help[i++]=arr[p2++];
        for(i=0;i<help.length;i++)arr[l+i]=help[i];
        return res;
    }

    public static void main(String[] args) {
        int[]arr={1,3,4,2,5};
        System.out.println(smallSum(arr));
    }

}
