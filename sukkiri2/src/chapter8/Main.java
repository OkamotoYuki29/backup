package chapter8;

public class Main {

	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "akira";
		c.hp = 5;
		c.mp = 4;
		c.selfAid();
		c.selfAid();
		c.pray(3);
		c.selfAid();
		System.out.println(c.mp);
	}

}
