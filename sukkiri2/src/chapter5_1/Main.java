package chapter5_1;

public class Main {
	public static void main(String[] args){
		introduceOneself();
	}
	public static void introduceOneself(){
		String name = "okamoto";
		int age = 25;
		double height = 177.7;
		char gender = '男';
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("性別は" + gender + "です");
	}
}
