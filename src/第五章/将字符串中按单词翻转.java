package 第五章;

public class 将字符串中按单词翻转 {

	/**
	 * 将字符串按单词翻转，例如here you are//are you here
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(reverse("here you are"));

	}
	static String reverse(String str) {
		String[]words=str.split("\\s");
		StringBuilder sb=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]+" ");
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		return sb.toString();
	}

}
