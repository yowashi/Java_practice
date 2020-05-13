package text_practice;

import java.io.Console;

public class lesson01 {
	public static void main(String[] args) {
		String name;
		Console console = System.console();
		System.out.println("名前を入力してください。");
		name = console.readLine();
		System.out.println(name + "さん、こんにちは");
	}
}
