package Free;

public class Hero {
	private String name;
	private int hp;
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	public int getHp() {return this.hp;}
	public void setHp(int hp) {this.hp = hp;}
	Hero(String name){
		this.hp = 100;
		this.name = name;
	}
	public String toString() {
		return "名前:" + this.name + "/HP:" + this.hp;
	}
}
