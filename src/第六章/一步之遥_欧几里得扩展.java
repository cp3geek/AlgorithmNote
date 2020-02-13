package 第六章;

public class 一步之遥_欧几里得扩展 {

	/**
	 * 题目：
	 * 小明被关在矿车上，
	 * 他的面前是两个按钮，分别写着“F”和“B”
	 * 这两个按钮可以控制矿车在轨道上前进和后退
	 * 按F，会前进97米。按B会后退127米
	 * 透过昏暗的灯光，小明看到自己前方1米远正好有个监控探头。他必须设法让矿车正好停到摄像头下方
	 *或许通过多次F和B操作可以办到
	 *矿车动力不太足
	 *每次操作都会消耗一定的能量
	 *请问至少需要多少次操作才能把矿车准确得停在摄像头下 
	 * 
	 */
	
	/**
	 * 转换成方程97x-127y=1;
	 * 求第一个解
	 * 
	 */
	static long x;
	static long y;
	public static void main(String[] args) {
		try {
			linearEquation(97, -127, 1);
			System.out.println(x+" "+y);
			System.out.println(Math.abs(x)+Math.abs(y));//求绝对值
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static long ext_gcd(long a,long b) {
		if(b==0) {
			x=1;
			y=0;
			return a;
		}
		long res=ext_gcd(b,a%b);
		long x1=x;
		x=y;
		y=x1-a/b*y;
		return res;
	}
	
	public static long linearEquation(long a,long b,long m) throws Exception {
		long d=ext_gcd(a,b);
		if(m%d!=0)throw new Exception("无解");
		long n=m/d;
		x*=n;
		y*=n;
		return d;
	}
	
	

}
