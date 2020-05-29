package text_practice;

import java.io.Console;

public class lesson05 {
	public static void main(String[] args) {
		final int answer = 3;
		int input;
		System.out.println("コンピュータが思い浮かべた数字を当ててね");
		System.out.println("[これだ]と思うすうじを1~10まで入力しましょう");

		Console console = System.console();
		input = Integer.parseInt(console.readLine());

		if (input == answer) {
			System.out.println("お見事、アタリです");
		} else {
			System.out.println("残念、ハズレです");
		}
	}
}
