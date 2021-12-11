import java.io.*;

//このMakeDist.javaを実行すると，自動的に確率密度分布が生成される．

public class MakeDist04 {

//<使い方>
//
//①　セル(1,1) から縦に１列分のデータを並べたcsv形式の入力ファイルを用意する．
//

//② 入出力ファイルのあるフォルダ名を設定する．
//ここを空にするとカレントディレクトリを参照する．
//"C:\\myprogramJ\\分布とヒストグラムの作成\\";
public static final String folderName = "";;


//③　以下のパラメータを適切に設定する．

public static final double xmax =  5;		//x軸の値の配列の最大値
public static final double xmin = -5;		//x軸の値の配列の最小値
public static final double dx   = 0.1;		//x軸の値の配列，区間配列(y[])の差分

public static final int    Nmax = 500;		//x軸の値(ラベル)の配列(x[])の最大数
						//配列サイズを定義するための定数
						//
						// Nmax ≒ (生データのサイズ)/100 以下程度
						//
						//区間配列の個数(N ≦ Nmax)
						//int N = (int)((xmax -xmin)/dx + 1);\
						//でNが定義されるので，Nmaxを N ≦ Nmax となるよう定める．


//④　コマンドプロンプトからMakeDist.javaをコンパイルして実行する．
//
//⑤　以下のようなExcelのFrequency関数に準じた形式で，
//    データのヒストグラムから得られる確率密度分布が出力される．
//    また，データの平均，分散から得られる正規分布pdfがf(x)として出力される．
/*-----------------------
配列yの個数：N+1
配列xの個数：N

y[i] < y[i-1]
Count[i-1] (y[i] < data ≦ y[i-1]なるdataの数)

-------------------------
y[0]
	x[0]	Count[0]	Dist[0]
y[1]
…
y[i-1]
	x[i-1]	Count[i-1]	Dist[i-1]
y[i]
…
y[N-1]
	x[N-1]	Count[N-1]	Dist[N-1]
y[N]

(N ≦ Nmax)
------------------------
*/


	public static void main(String[] args) {
		try {
			//データを入出力するcsvファイル名を標準入力させる．
			System.out.println("The current data folder is "+ folderName+". \n");
			System.out.print("Enter an input file name (without .csv): ");
			BufferedReader buffIn = new BufferedReader(new InputStreamReader(System.in));
			String inputFileName = folderName + buffIn.readLine()+".csv";
			System.out.println("Reading the input data file: "+inputFileName);
			System.out.println("...");
			System.out.print("Enter an output file name (without .csv): ");
			BufferedReader buffOut = new BufferedReader(new InputStreamReader(System.in));
			String outputFileName = folderName + buffOut.readLine()+".csv";
			System.out.println("Producing the output data file: "+outputFileName);
			System.out.println("...");
			
			
			//区間配列の個数(N ≦ Nmax)
			int N = (int)((xmax -xmin)/dx + 1);

			if(N<=Nmax){

				//ファイル名の設定（<使い方>②）
				File       InputCSV  = new File(inputFileName); 
				FileWriter OutputCSV = new FileWriter(outputFileName);
				
				//変数の定義
				double[] y = new double[Nmax+1];
				double[] x = new double[Nmax];
				int[] Count = new int[Nmax];
				double[] Dist = new double[Nmax];
				double[] f = new double[Nmax];
				double data;
				int dataSize = 0;	//分布にカウントされるデータ数
				int rawDataSize = 0;	//もとのデータ数
				double ymax = xmax + 0.5 * dx;
				double ymin = xmin - 0.5 * dx;
				double dataMax, dataMin;

				double aveData = 0;	//データの平均値
				double varData = 0;	//データの分散
				double SDData = 0;	//データの標準偏差
				double sumData = 0;	//データの和
				double sumSqData = 0;	//データの二乗和


				String line;

				//入力ファイルの読み込み
				BufferedReader br = new BufferedReader(new FileReader(InputCSV));

				for(int i = 0; i< N; i++){
					x[i] = xmax - i * dx;
					y[i] = ymax - i * dx;
					Count[i] = 0;
				}
				y[N] = ymax - N * dx;
				Count[N] = 0;

				//ひとつめのデータの読み込みと初期値設定
				//最大値・最小値などを決めるため，
				//ひとつめのデータだけwhile文の外で読み込み，初期状態を作る
				line = br.readLine();
				data = Double.parseDouble(line);//引数(String型)をdouble型に変換するメソッド
				dataMax = data;
				dataMin = data;
				sumData = data;
				sumSqData = Math.pow(data,2);
				rawDataSize++;
				if(ymin < data && data <= ymax){
					int i = (int)((ymax - data)/dx);
					Count[i]++;
					dataSize++;
				}

				//２個目以降のデータの読み込み
				while ((line = br.readLine()) != null) {

					data = Double.parseDouble(line);
					rawDataSize++;
					if(dataMax < data){
						dataMax = data;
					}
					if(data < dataMin){
						dataMin = data;
					}
					sumData = sumData + data;
					sumSqData = sumSqData + Math.pow(data,2);			

					if(ymin < data && data <= ymax){
						int i = (int)((ymax - data)/dx);
						Count[i]++;
						dataSize++;
					}
	      		}
				br.close();

				aveData = sumData / rawDataSize;
                		varData = (sumSqData - 2 * aveData * sumData + rawDataSize * Math.pow(aveData, 2)) / (rawDataSize - 1);
				SDData = Math.sqrt(varData);

				for(int i = 0; i< N; i++){
					Dist[i] = Count[i]/(dx * dataSize);
					
					//Gaussian
					f[i] = Math.exp(-Math.pow((x[i]-aveData),2)/(2*varData))/Math.sqrt(2*Math.PI*varData);
				}

				//書き出し
				PrintWriter pw = new PrintWriter(new BufferedWriter(OutputCSV));

				pw.write("The number of the original data: " + rawDataSize + "\r\n");
				pw.write("The max. value: " + dataMax + "\r\n");
				pw.write("The min. value: " + dataMin + "\r\n");
				pw.write("The average E(x): " + aveData + "\r\n");
				pw.write("The variance V(x): " + varData + "\r\n");
				pw.write("The standard deviation √V(x): " + SDData + "\r\n");
				pw.write("\r\n");
				pw.write("[The probability density distribution] \r\n");
				pw.write("The number of data for the distribution: " + dataSize + "\r\n");
				pw.write("The interval of y: " + ymin +" < y ≦ "+ ymax + "\r\n");
				pw.write("The interval of x: " + xmin +" ≦ x ≦ "+ xmax + "\r\n");
				pw.write("The delta of x: " + dx + "\r\n");
				pw.write("x , Dist(x), f(x): \r\n");
				for(int i = 0; i< N; i++){
					pw.write(x[i] + "," + Dist[i] + ","+ f[i] + "\r\n");
				}

				pw.close();
				
				System.out.println("The number of the original data: " + rawDataSize );				
				System.out.println("The number of data for the distribution: " + dataSize );

			}
			else{
				System.out.println("Error! Nmax is too small!");
				System.out.println("Nmax must be greater than or equal to" + N + ".");

			}

		}catch (FileNotFoundException e) {
			// Fileオブジェクト生成時の例外捕捉
			e.printStackTrace();
			/*
			printStackTrace()
			例外が投げられた理由を取得できる．
			引数を渡さずに呼び出すと標準エラー出力に出力される． 
			引数にPrintWriterクラスを渡すと，渡した文字出力ストリームを通して出力されるため，
			文字列やファイル等，好きな出力先を選択することもできる．
			*/

		}catch (IOException e) {
			// BufferedReaderオブジェクトのクローズ時の例外捕捉
			e.printStackTrace();
		}
	}
}

