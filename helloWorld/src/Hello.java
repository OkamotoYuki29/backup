import java.io.*;

public class Hello {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力してください");
		String t= br.readLine();
		System.out.println(t);
	}
}
