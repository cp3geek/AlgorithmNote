package 第五章;

public class Suff implements Comparable<Suff>{
	String str;
	int index;
	public Suff(String str, int index) {
		super();
		this.str = str;
		this.index = index;
	}
	@Override
	public int compareTo(Suff o) {
		return this.str.compareTo(o.str);
	}
	@Override
	public String toString() {
		return "Suff [str=" + str + ", index=" + index + "]";
	}
	
	

}
