
public class Capsule {
	public static void main(String[] args){
		Person i = new Person();
		i.setName("岡本侑貴");
		i.setGender('男');
		i.setHeight(177.7F);
		i.setWeight(80.2);
		System.out.println("【プロフィール】");
		System.out.println("名前:" + i.getName());
		System.out.println("性別:" + i.getGender());
		System.out.println("身長:" + i.getHeight() +"cm");
		System.out.println("体重" + i.getWeight() + "kg");
	}
}
