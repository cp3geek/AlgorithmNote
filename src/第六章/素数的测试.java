package 第六章;

import java.util.HashMap;
import java.util.Map;

public class 素数的测试 {

	public static void main(String[] args) {
		Map<Integer,Integer> map=primeFactor(100);
		StringBuilder sb=new StringBuilder();
		//遍历map，map里面有一个entry，包含键值
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			int k=entry.getKey();
			int v=entry.getValue();
			for(int j=0;j<v;j++) {
				sb.append("*"+k);
			}
			
		}
		System.out.println(sb.substring(1));
	}
	/**
	 * 判断该数是否为素数
	 */
	public static boolean isPrime(int num) {
		for(int i=2;i*i<=num;i++) {
			if(num%i==0)return false;
		}
		return true;
	}
	
	
	/**
	 * 质因数分解
	 */
	public static Map<Integer, Integer>primeFactor(int num){
		Map<Integer, Integer>map=new HashMap<>();
		for(int i=2;i*i<=num;i++) {
			while(num%i==0) {
				Integer v=map.get(i);
				if(v==null)map.put(i, 1);
				else map.put(i, v+1);
				num/=i;
			}
		}
		return map;
	}

}
