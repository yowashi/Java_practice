package analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public abstract class Analyzer {
	protected HashMap<Integer, String> map;
	protected File dataFile;
	protected String name;
	protected String analysis;

	//コンストラクタ:初期化処理
	public Analyzer(String fileName) {}

	//診断のメインシナリオ
	public void analyze() {}

	//loadData:データの読み込み
	protected void loadData()
	throws FileNotFoundException, DataNotFoundException, IOException{
}

	//開始メッセージ表示
	protected abstract void showStartMessage();
	//診断実施
	protected abstract void getAnalysis();
	//診断結果
	protected abstract void showResult();
}
