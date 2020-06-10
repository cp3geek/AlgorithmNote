package 练习;

public class Main_2 {

	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			if(i%2==0)System.out.print(i==2?"偶数："+i+" ":i+" ");
			else {
				System.out.println();
				System.out.print(i==1?"奇数："+i+" ":i+" ");}
		}

	}

}
