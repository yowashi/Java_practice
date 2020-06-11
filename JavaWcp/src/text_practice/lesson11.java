package text_practice;

import java.io.Console;
import java.util.HashMap;
public class lesson11 {
	public static void main(String[] args) {
		//HashMap作成
		HashMap<String, String>dictionary = new HashMap<String, String>();

		System.out.println("簡単単語帳へようこそ");

		//初期処理
		Console console = System.console();
		int flag = 0;

		//プログラムメイン部
		while(true) {
			//操作内容選択メッセージ
			System.out.println("****** なにをしますか ******");
			System.out.println("--> 単語登録する場合は1を入力");
			System.out.println("--> 単語を調べる場合は2を入力");
			System.out.println("--> 単語を削除する場合は3を入力");
			System.out.println("--> 終了する場合は9を入力");

			//入力値を取得
			flag = Integer.parseInt(console.readLine());

			//単語格納用変数の宣言と初期化
			String english= "";
			String japanese= "";

			//入力された数値による処理の内容の分岐
			//1:単語を登録
			if(flag == 1) {
				System.out.println("登録したい英単語を半角英字で入力してください");
				english = console.readLine();

				System.out.println("英単語の意味を日本語で入力してください");
				japanese = console.readLine();

				//HashMapに単語登録
				dictionary.put(english, japanese);
				System.out.println("単語を登録しました \n");

				//2: 単語の意味を調べる
			}else if (flag == 2) {
				System.out.println("意味を調べたい単語を入力してください");
				english = console.readLine();
				japanese = dictionary.get(english);

				if(japanese == null) {
					System.out.println("その単語は登録されていません \n");
				}else {
					System.out.println(english + "の意味は" + japanese + "です \n");
				}
			}else if(flag == 3) {
				System.out.println("削除したい英単語を入力してください");
				english = console.readLine();
				japanese = dictionary.get(english);
				if (japanese == null) {
					System.out.println("その単語は登録されていません \n");
				}else {
					dictionary.remove(english);
					System.out.println(english + "を削除しました \n");
				}
			} else if(flag == 9) {
				System.out.println("プログラムを終了します");
				System.exit(0);
				//1,2,3,9以外が入力された場合の処理
			} else {
				System.out.println("数字の１、２、３、９のどれかを入力してください \n");
				continue;
			}
		}
	}
}
