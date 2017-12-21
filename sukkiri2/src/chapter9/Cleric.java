package chapter9;

public class Cleric {
	//field
	String name;
	int hp;
	static final int maxHp = 50;
	int mp;
	static final int maxMp = 10;
	//セルフエイド
	public void selfAid(){
		if(this.mp < 5){
			System.out.println("MPが不足しています");
		}else{
		System.out.println(this.name + "はセルフエイドを唱えた!");
		this.mp -=5;
		this.hp = this.maxHp;}
	}
	//祈る
	public int pray(int sec){
		//乱数を取得
		int r = new java.util.Random().nextInt(3);
		//回復値を取得
		int recover = Math.min(r + sec, this.maxMp - this.mp);
		//実行
		System.out.println(this.name + "は天に祈った");
		this.mp += recover;
		System.out.println("MPが" + recover + "回復した!");
		return recover;
	}
	//コンストラクタ
	Cleric(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	Cleric(String name, int hp){
		this(name,hp,Cleric.maxMp);
	}
	Cleric(String name){
		this(name,Cleric.maxHp);
	}

}
