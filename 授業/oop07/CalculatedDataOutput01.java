import java.io.*;
import java.util.*;

/*
繰り返しデータをファイル出力します．
outputFileNameにcsvファイル名を入れ，
生成したデータをcsv形式で保存します．
*/

public class CalculatedDataOutput01 {
	//Iteration回数：Imax
	public static final int Imax = 10000;	

	public static void main(String[] args) {
		try {
	
			//?A’（シンプル）データを保存するcsvファイル名を入力する
			String outputFileName = "./data01.csv";

			//?BBufferedWriterクラスのインスタンスを生成し
			//参照型変数 pw に代入する．
			//読み込むファイルを FileWriter() で初期化する．
			PrintWriter pw = 
			new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)));

			double y;
			Random rnd = new Random();
			
			//Imax個のデータを生成する
			for (int i=1; i<= Imax; i++) {

				//正規乱数Norm(0,1)を生成するメソッド
				y = rnd.nextGaussian();

				//?Cデータの出力の仕方を選ぶ
				pw.write(y + "\r\n");				//[データのみ]　1行
				//pw.write(i + "," + y + "\r\n");	//[データ番号, データ]　2行
        	}
			pw.close();//ファイルを閉じる
			
		}catch (FileNotFoundException e) {
			// Fileオブジェクト生成時の例外捕捉
			e.printStackTrace();
		}catch (IOException e) {
			// BufferedReaderオブジェクトのクローズ時の例外捕捉
			e.printStackTrace();
		}
	}
}
