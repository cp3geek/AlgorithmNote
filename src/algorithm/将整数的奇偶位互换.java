package algorithm;

public class 将整数的奇偶位互换 {

	public static void main(String[] args) {
		int i=13;
		int ou=i&0xaaaaaaaa;//用16进制表示1010 1010.....
		int ji=i&0x55555555;//0101 0101 0101
		System.out.println((ou>>1)^(ji<<1));
		System.out.println(Integer.toString(i, 2));
		System.out.println(0b1100);
		
	}

}
