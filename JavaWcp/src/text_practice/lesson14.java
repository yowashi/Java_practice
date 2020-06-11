package text_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lesson14 {
	public static void main(String[] args) {
		System.out.println("++++テキストファイルのコピープログラム(バッファ版)++++");
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
			BufferedReader input = new BufferedReader(new FileReader(file_in));
			BufferedWriter output = new BufferedWriter(new FileWriter(file_out));

			String word = "";
			while((word = input.readLine())!= null) {
				output.write(word,0,word.length());
				if(input.ready())output.newLine();
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
