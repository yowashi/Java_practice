package text_practice;
import java.util.ArrayList;
public class lesson09 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add ("Taro yamada");
		list.add ("Oka yamada");
		list.add("Kaoru yamada");
		list.add("Sato yamada");
		list.add("Tomori yamada");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
	}
}
