import java.io.*;

class ListupFileName{
	public static void main( String [] args ){
		
		String folder = "."; // 一覧を表示するフォルダ(この例ではカレントフォルダとしている)
		File f = new File( folder ); // そのフォルダ中のファイル情報を得る
		
		String [] files = f.list(); // ファイルのリスト一覧を得る
		int n = files.length; // ファイル数を得る

		System.out.println( "In folder " + folder + ", the number of files is " + n + ".");
		System.out.println( "The files are as follows: " );
		for( int k = 0; k < n; k++ ){
			System.out.println( folder + "/" + files[k] ); // k番目のファイルを表示する
		}
	}
}

