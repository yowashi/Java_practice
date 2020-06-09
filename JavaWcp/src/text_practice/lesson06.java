package text_practice;

import java.io.Console;

public class lesson06 {
	public static void main(String []args) {
		double dblAnswer = Math.random()*10 + 1;
		int  intAnswer = (int)dblAnswer;
		int input;
		System.out.println("コンピュータが思い浮かべた数字を当ててね");
		System.out.println("[これだ]と思うすうじを1~10まで入力しましょう");
	Console console = System.console();

	for(int i = 0; i < 3; i++) {
		input = Integer.parseInt(console.readLine());
		if (input == intAnswer) {
			System.out.println("あたりです");
			break;
		}else {
			if (i < 2) {
				System.out.println("違います、チャンスはあと" +(2 - i) + "回です");
			}else {
				System.out.println("残念、答えは" + intAnswer +"です");
				}
			}
		}
	}
}