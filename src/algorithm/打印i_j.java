package algorithm;

public class 打印i_j {

	public static void main(String[] args) {
		f(1,20);

	}
	
	static void f(int i,int j) {
		if(i>j)return;
		System.out.println(i);
		f(i+1,j);
	}

}
