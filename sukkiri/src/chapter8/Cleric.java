package chapter8;

public class Cleric {
	String name;
	int hp;
	final int maxHp = 50;
	int mp;
	final int maxMp = 10;

	public void selfAid(){
		if(this.mp >= 5){
			System.out.println(name + "�́A�Z���t�G�C�h��������!");
			this.mp -= 5;
			this.hp = maxHp;
			System.out.println(name + "�́A�g�o�����S�ɉ񕜂���!");
		}else{System.out.println("MP������Ȃ��B");}
	}
	public int pray(int sec){
		System.out.println(name +"��" + sec + "�b�ԓV�ɋF����!");
		int recover = sec + new java.util.Random().nextInt(3);
		int recoverActual = Math.min(recover, maxMp-mp);
		this.mp = recoverActual;
		System.out.println(name +"�͂l�o��" + recoverActual + "�񕜂���!");
		return recoverActual;
	}
}