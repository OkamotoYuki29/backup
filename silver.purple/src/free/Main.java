package free;

public class Main{
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			s.append(i).append(",");
		}
		System.out.println(s);
		String s1 = s.toString();
		String[] a = s1.split("[,]");
		for(String c : a) {
			System.out.println(c);
		}
	}
}