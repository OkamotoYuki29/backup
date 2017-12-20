package chapter11;

public class PoisonMatango extends Matango{
	private int poisonAttackCount = 5;
	public PoisonMatango(char suffix){
		super(suffix);
		super.hp += 0;
	}
	public void attack(Hero h){
		super.attack(h);
		if(this.poisonAttackCount != 0){
			System.out.println("さらに毒の胞子をばらまいた!");
			int damage = h.getHp() / 5;
			h.setHp(h.getHp() - damage);
			System.out.println(damage + "ポイントのダメージ");
			this.poisonAttackCount --;
		}
	}
}
