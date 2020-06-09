package text_practice;

import java.io.Console;

public class lesson05 {
	public static void main(String[] args) {
		double dblAnswer = Math.random()*10 + 1;
		int  intAnswer = (int)dblAnswer;
		int input;
		System.out.println("コンピュータが思い浮かべた数字を当ててね");
		System.out.println("[これだ]と思うすうじを1~10まで入力しましょう");

		Console console = System.console();
		input = Integer.parseInt(console.readLine());

		if (input == intAnswer) {
			System.out.println("お見事、アタリです");
		} else if (input < intAnswer) {
			System.out.println("残念、小さすぎました。答えは" + intAnswer + "です");
		} else {
			System.out.println("残念、大きすぎました。答えは" + intAnswer + "です");
		}
	}
}
