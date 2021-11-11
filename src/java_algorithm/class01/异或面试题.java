package java_algorithm.class01;


/*
* 1):一组数中，有一个数只出现了奇数次，其余所有的数都出现了偶数次，请找出出现奇数次的数，时间复杂度为o（n）
* 2):一组数中，有两个数出现了奇数次，其余所有的数都出现了偶数次，请找出出现奇数次的两种数，时间复杂度为o(n)
*
*
* */
public class 异或面试题 {
    public static int findOdd(int[]arr){
        int result=0;
        for(int i:arr){
            result^=i;
        }
        return result;
    }

    public static void findTwoOdd(int[]arr){
        int eor=0;
        for(int curNum:arr){
            eor^=curNum;
        }
        /**
         * eor=a^b
         * eor !=0
         * eor的二进制位必然有一个位置上是1
         */

        int rightOne=eor&(~eor+1);//提取出最右的1
        /**
         * ~是取反符号
         * 假如
         * eor:    1010111100
         * ~eor:   0101000011
         * ~eor+1: 0101000100
         *
         * eor&(~eor+1): 0000000100
         */

        int OnleOne=0;//eor`
        for(int cur:arr){
            if((cur&rightOne)==0){//将数组中的数分成两组，二进制位最右边位置为0的数取出与onleone异或，得到a或者b
                OnleOne^=cur;
            }
        }
        System.out.println(OnleOne+","+(eor^OnleOne));

    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,4,5,4,5,6,6,7,7,8,8,9,9};
        System.out.println(findOdd(arr));
        int[] arr1={2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,9,1,1,1};
        findTwoOdd(arr1);

    }

}
