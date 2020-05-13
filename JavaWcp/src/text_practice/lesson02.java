package text_practice;

import java.io.Console;

public class lesson02 {
	public static void main(String[] args) {
		int a;
		int b;
		int answer;

		Console console = System.console();
		System.out.println("2つの値で足算を行います");
		System.out.println("1つ目の値を入力してください");
		a = Integer.parseInt(console.readLine());

		System.out.println("2つ目の値を入力してください");
		b = Integer.parseInt(console.readLine());

		answer = a+b;
		System.out.println(a + "足す" + b + "の答えは" + answer);
	}
}
