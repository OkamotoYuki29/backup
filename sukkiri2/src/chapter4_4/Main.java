package chapter4_4;

public class Main {
	public static void main(String[] args){
		int[] numbers = new int[]{3,4,9};
		for(int i = 0; i < numbers.length; i++){
			System.out.println("1桁の数字を入力してください");
			int input = new java.util.Scanner(System.in).nextInt();
			if(numbers[i] == input){
				System.out.println("アタリ!");
			}
		}
	}
}