package jugyou;

public class Hoshinoshutugenn {

	public static void main(String[] args) {
		//星の出現
		//問1
		int a = 0;
		while(a < 5){
			System.out.print("★");
			a++;
		}
		System.out.print("\n");
		System.out.print("\n");
		//問2
		for(int b = 0; b < 2; b++){
			for(int c = 0; c < 3; c++){
				System.out.print("★");
			}System.out.print("\n");
		}

		System.out.print("\n");

		//上級問1
		for(int e = 1; e <= 30; e++){
			String g = e % 6 ==0 ? "\n" : "★";
			System.out.print(g);
		}

		System.out.print("\n");

		//上級問2
		for(int h = 1; h <= 25; h++){
			String i = h % 2 ==1 ? "★" : "☆";
			System.out.print(i);
			if(h % 5 ==0){
				System.out.print("\n");
			}
		}

		System.out.print("\n");

		//上級問3
		for(int h = 1; h <= 25; h++){
			String i = h % 6 !=1 ? "★" : "☆";
			System.out.print(i);
			if(h % 5 ==0){
				System.out.print("\n");
			}
		}

		System.out.print("\n");

		//上級問4
		for(int j = 0; j < 5; j++){
			int l = 0;
			while(l < 5){
				String k = j >= l ? "★" : "";
				System.out.print(k);
				l++;
			}
			System.out.print("\n");
		}

		System.out.print("\n");

		//上級問5
		for(int m = 1; m <= 5; m++){
			for(int n = 1; n <= 5; n++){
				if(n <= m){
					String o = n == m ? "☆" :"★";
					System.out.print(o);
				}
			}
			System.out.print("\n");
		}
	}

}