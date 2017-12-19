package chapter8;

public class Main {
	public static void main(String[] args){
		Cleric c = new Cleric();
		c.name = "ÉAÉJÉl";
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
	}
}
