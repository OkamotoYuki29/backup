package free;

public class Main{
<<<<<<< HEAD
	public static void main(String[] args){
		int i1 = 100;
		Integer obj = i1;
		obj = 200;
		System.out.println(obj);
		System.out.println(i1);
=======
	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5};
		int i = 1;
		while(i < ary.length) {
			i++;
			if(i == 2) {
				continue;
			}
			System.out.println(i + " ");
			if(i > 3) {
				break;
			}
		}
>>>>>>> 6dab56d780063b7e8a16f6ecc3127ad22774c52c
	}
}

