package chapter8;

public class Cleric {
	//field
	String name;
	int hp;
	final int maxHp;
	int mp;
	final int maxMp;
	//コンストラクタ
	Cleric(){
		this.maxHp = 50;
		this.maxMp = 10;
	}
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

}
