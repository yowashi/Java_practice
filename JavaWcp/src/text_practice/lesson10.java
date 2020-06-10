package text_practice;

import java.util.ArrayList;

public class lesson10 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add ("Taro yamada");
		list.add ("Oka yamada");
		list.add("Kaoru yamada");
		list.add("Sato yamada");
		list.add("Tomori yamada");

		//通常のfor文を用いた処理
		System.out.println("----for文----");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//拡張for文を用いた処理
		System.out.println("----拡張for文----");
		for (String str: list) {
			System.out.println(str);
		}
		//while文を用いた処理
		System.out.println("----while文----");
		int j = 0;
		while (j < list.size()) {
			System.out.println(list.get(j));
			j++;
		}
	}
}
