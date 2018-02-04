package chapter13;

public class Main {
	public static void main(String[] args){
		Y[] ab = new Y[2];
		ab[0] = new A();
		ab[1] = new B();
		for(Y y : ab){
			y.b();
		}
	}
}
