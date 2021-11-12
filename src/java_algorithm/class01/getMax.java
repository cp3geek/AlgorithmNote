package java_algorithm.class01;

public class getMax {

    public static int getMax(int[]arr){
        return process(arr,0,arr.length-1);

    }

    public static int process(int[]arr,int L,int R){
        if(R==L)return arr[L];
        /**
         * 求中点
         * mid=(R+L)/2,但可能会溢出
         * mid=L+(R-L)/2
         */
        int mid=L+((R-L)>>1);
        int leftMax=process(arr,L,mid);
        int rightMax=process(arr,mid+1,R);
        return Math.max(leftMax,rightMax);
    }


    public static void main(String[] args) {

    }
}
