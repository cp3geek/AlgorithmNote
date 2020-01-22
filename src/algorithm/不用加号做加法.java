package algorithm;

public class 不用加号做加法 {

	public static void main(String[] args) {
		System.out.println(Add(20,15));

	}
	 public static int Add(int num1,int num2) {
	        while (num2 != 0) {
	            int temp = num1 ^ num2;//不进位的值
	            num2 = (num1 & num2) << 1;//进位值
	            num1 = temp;
	        }
	        return num1;
	    }
	 //1111和10010
	 //temp=11101      temp=11111
	 /*
	  * num2=00010;00000
	  * num1=11101 11111
	  * 
	  * */

}
