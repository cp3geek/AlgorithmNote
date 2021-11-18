package java_algorithm.class01;

public class RadixSort {
    public static void radixSort(int[]arr){
        if(arr==null||arr.length<2)return;
        radixSort(arr,0,arr.length-1,maxbits(arr));
    }

    //获取最大值的十进制位数
    public static int maxbits(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)max=Math.max(max,arr[i]);
        int res=0;
        while(max!=0){
            res++;
            max/=10;

        }
        return res;
    }

    //digit表示数组中的最大值有几个十进制位
    public static void radixSort(int[]arr,int L,int R,int digit){
        final int radix=10;
        int i=0,j=0;
        int[]bucket=new int[R-L+1];
        for(int d=1;d<=digit;d++){//出桶进桶次数由十进制位数决定
            //10个空间
            //count[0]当前位（d位）是0的数字有多少个
            //count[1]当前位（d位）是（0、1）的数字有多少个
            //count[2]当前位（d位）是（0、1、2）的数字有多少个
            //count[i]当前位（d位）是（0-i）的数字有多少个
            int[] count=new int[radix];
            for(i=L;i<=R;i++){
                j=getDigit(arr[i],d);//d如果是1，就取出个位数字，如果是2就取出十位数字，如果是3就取出百位数字
                count[j]++;
            }
            for(i=1;i<radix;i++) count[i]=count[i]+count[i-1];//然后将count数组处理成前缀和
            for(i=R;i>=L;i--){//然后从右往左遍历数组
                j=getDigit(arr[i],d);//拿出当前数的d位上的数
                bucket[count[j]-1]=arr[i];//根据count数组填入到辅助数组中
                count[j]--;
            }//这一步所有数字出桶
            for(i=L,j=0;i<=R;i++,j++)arr[i]=bucket[j];
        }
    }

    private static int getDigit(int i, int d) {
        return 0;
    }
}
