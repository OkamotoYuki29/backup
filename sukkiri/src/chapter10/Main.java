package chapter10;

public class Main {
	public static void main(String[] args){
		Wand wan = new Wand();
		wan.setName("古い杖");
		wan.setPower(5.3);
		Wizard w = new Wizard();
		w.setName("西の魔女");
		w.setHp(35);
		w.setMp(100);
		Hero h1 = new Hero();
		h1.setHp(100);
		h1.setMp(20);
		h1.setName("アキラ");
		w.heal(h1);
	}
}