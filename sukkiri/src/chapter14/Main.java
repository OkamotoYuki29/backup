package chapter14;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Main{
	public static void main(String[] args) throws Exception {
		//本日の日時を表示する
		Date now = new Date();
		SimpleDateFormat f= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = f.format(now);
		System.out.println(s);
		//指定日時の文字列を解析しDate型として得る
		Date d = f.parse(s);
		System.out.println(d);
		String ss = f.format(d);
		System.out.println(ss);
	}

}
