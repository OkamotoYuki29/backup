package question;

public class Test3_14 {
	public static void main(String[] args) {
		String str1 = "existence";
		str1.replace("e", "*");    //新しくできた"*xist*nc"はどこにも参照されていない？
								   //str1の参照先は"existence"のまま？
		System.out.println(str1);

		String str2 = "existence";
		String a = str2.replace('e','*');
		System.out.println(a);
	}
}