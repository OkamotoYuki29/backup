
public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		Person yuki = new Person();
		yuki.name = "岡本";
		yuki.age = 25;
		System.out.println(yuki.name);
		System.out.println(yuki.age);
		taro.phoneNumber = "090-0000-0000";
		taro.address = "aaa@gmail.com";
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
	}
}
