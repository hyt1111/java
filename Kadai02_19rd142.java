import java.io.*;
//Scaner クラスを含む 
public class Kadai02_19rd142 { 
	public static void main(String[] args) { 
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Prease input some strings: "); 
			String str = br.readLine(); 
			str=str.replaceAll("a","x");
			str=str.replaceAll("[b-z]","o");
			str=str.replaceAll("[A-Z]","o");
			str=str.replaceAll("[0-9]","o");
			System.out.println("Your input strings are : "+str);
			//System.out.println("Your input strings are : "+str); 
		}catch (IOException e) {
			// BufferedReaderオブジェクトのクローズ時の例外捕捉
			e.printStackTrace();
		}finally{ 
			//どんな例外が出ても，ここは実行される 
			System.out.println("It was done(1)"); 
		} 
			//想定外の例外が出るとここは実行されない 
			System.out.println("It was done(2)");
	} 
}