package analyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public abstract class Analyzer {
	protected HashMap<Integer, String> map;
	protected File dataFile;
	protected String name;
	protected String analysis;

	//コンストラクタ:初期化処理
	public Analyzer(String fileName) {
		map =new HashMap<Integer,String>();
		try {
			dataFile = new File(fileName);
			loadData();
		} catch(FileNotFoundException ex) {
			System.out.println("診断ファイルが見つかりません");
			System.exit(0);
		} catch(DataNotFoundException ex) {
			System.out.println("診断データが登録されていません");
			System.exit(0);
		} catch(IOException ex) {
			System.out.println("入出力エラーが発生しました");
			System.exit(0);
		}
	}

	//診断のメインシナリオ
	public void analyze() {
		showStartMessage();
		getAnalysis();
		showResult();
	}

	//loadData:データの読み込み
	protected void loadData()
	throws FileNotFoundException, DataNotFoundException, IOException{
		BufferedReader input = new BufferedReader(new FileReader(dataFile));

		String word = "";
		while((word = input.readLine())!= null) {
			if(!word.isEmpty()) {
				String key = word.split(",")[0];
				String value = word.split(",")[1];

				if(key != null && value != null) {
					map.put(Integer.parseInt(key), value);
				}
			}
		}
		input.close();
		if(map.size() <=0) {
			throw new DataNotFoundException();
		}
}

	//開始メッセージ表示
	protected abstract void showStartMessage();
	//診断実施
	protected abstract void getAnalysis();
	//診断結果
	protected abstract void showResult();
}
