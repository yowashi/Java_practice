package text_practice;

import java.io.Console;

public class lesson03 {
	public static void main(String[] args) {
		double number;
		Console console = System.console();
		System.out.println("平方根を求めます");
		System.out.println("1~10000までの任意の数値を入力してください");
		number = Double.parseDouble(console.readLine());
		System.out.println(number + "の平方根は" + Math.sqrt(number) + "です");
	}
}
