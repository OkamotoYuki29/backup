package free;

public class Main{
	public static void main(String[] args){
		StringBuilder sb1 = new StringBuilder("Ab Cdefge");
		System.out.println(sb1.append("XYZ"));
		System.out.println(sb1.insert(2,"ZZ"));
		System.out.println(sb1.reverse());
		StringBuilder sb2 = new StringBuilder("Ab Cdefge");
		sb2.setCharAt(2, 'Z');
		System.out.println(sb2);
		System.out.println(sb1.length());
	}
}