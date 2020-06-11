package text_practice;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lesson12 {
	public static void main(String[] args) {
		System.out.println("++++画像ファイルのコピープログラム++++");
		Console console = System.console();
		try {
			System.out.println("読み込み元の画像のファイルのパスを指定してください");
			String str_in = console.readLine();
			File file_in = new File(str_in);
			if (!file_in.exists()) {
				System.err.println("読み込み元の画像ファイルが見つかりません");
				System.exit(0);
			}
			System.out.println("書き出し先の画像ファイルのパスを指定してください");
			String str_out = console.readLine();
			File file_out = new File(str_out);
			if (file_out.exists()) {
				System.err.println("書き出し先に指定された画像ファイルはすでに存在します");
				System.exit(0);
			}
			FileInputStream input = new FileInputStream(file_in);
			FileOutputStream output = new FileOutputStream(file_out);

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
