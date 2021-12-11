import java.io.*;//InputStreamReader クラスが含まれる
//このクラスはコンパイルエラーが発生します 
public class InputSample { 
	public static void main(String[] args){ 
		try{
			//バイトストリームを文字ストリームに変換するため 
			InputStreamReader isr = new InputStreamReader(System.in); System.out.print("Prease input a charactor: ");
			//標準入力からバイトデータを読み込み単一の文字を返す 
			int c = isr.read(); System.out.println("Your input charactor is : "+(char)c);
		}catch (IOException e){ 
			System.out.println("IOException!!"); }

		}finally{ 
			//どんな例外が出ても，ここは実行される 
			System.out.println("It was done(1)"); 
		} 
			//想定外の例外が出るとここは実行されない 
			System.out.println("It was done(2)");
	}
}
