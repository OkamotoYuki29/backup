package chapter8;

public class Main {
	public static void main(String[] args){
		Cleric c = new Cleric();
		c.name = "�A�J�l";
		c.hp = 20;
		c.mp = 5;
		c.selfAid();
		c.selfAid();
		c.selfAid();
		c.selfAid();
		c.selfAid();
		c.selfAid();
		c.selfAid();
		c.pray(3);
		System.out.println(c);
	}
}
