package text_practice;

import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lesson13 {
	public static void main(String[] args) {
		System.out.println("++++テキストファイルのコピープログラム++++");
		Console console = System.console();
		try {
			System.out.println("読み込み元のテキストファイルのパスを指定してください");
			String str_in = console.readLine();
			File file_in = new File(str_in);
			if (!file_in.exists()) {
				System.err.println("読み込み元のテキストファイルが見つかりません");
				System.exit(0);
			}
			System.out.println("書き出し先のテキストファイルのパスを指定してください");
			String str_out = console.readLine();
			File file_out = new File(str_out);
			if (file_out.exists()) {
				System.err.println("書き出し先に指定されたテキストファイルはすでに存在します");
				System.exit(0);
			}
			FileReader input = new FileReader(file_in);
			FileWriter output = new FileWriter(file_out);

			int data = 0;
			while ((data = input.read()) >= 0){
				output.write(data);
			}

			output.flush();
			output.close();
			input.close();
			System.out.println(str_in + "を" + str_out + "にコピーしました");
		} catch(IOException e) {
			System.out.println("エラーが発生しました");
		}
	}
}
