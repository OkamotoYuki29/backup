package chapter9;

public class Cleric {
	static final int maxHp = 50;
	static final int maxMp = 10;
	String name;
	int hp;
	int mp;


	public void selfAid(){
		if(this.mp >= 5){
			System.out.println(name + "は、セルフエイドを唱えた!");
			this.mp -= 5;
			this.hp = maxHp;
			System.out.println(name + "は、ＨＰが完全に回復した!");
		}else{System.out.println("MPが足りない。");}
	}
	public int pray(int sec){
		System.out.println(name +"は" + sec + "秒間天に祈った!");
		int recover = sec + new java.util.Random().nextInt(3);
		int recoverActual = Math.min(recover, maxMp-mp);
		this.mp = recoverActual;
		System.out.println(name +"はＭＰが" + recoverActual + "回復した!");
		return recoverActual;
	}

	public Cleric(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name, int hp){
		this(name,hp,maxMp);
	}
	public Cleric(String name){
		this(name,maxHp);
	}
}

