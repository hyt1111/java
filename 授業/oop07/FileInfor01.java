import java.io.*;
import java.util.*;

class FileInfor01{
	FileInfor01(String fileName){
		File f = new File( fileName ); // 指定されたファイル情報を取得する
		System.out.println( "exists()         ：" + f.exists() ); // 存在するか?
		System.out.println( "getName()        ：" + f.getName() ); // 名前
		System.out.println( "canRead()        ：" + f.canRead() ); // 読めるか?
		System.out.println( "canWrite()       ：" + f.canWrite() ); // 書けるか?
		System.out.println( "getAbsolutePath()：" + f.getAbsolutePath() ); // 絶対パス
		System.out.println( "getPath()        ：" + f.getPath() ); // パス
		System.out.println( "isAbsolute()     ：" + f.isAbsolute() ); // 絶対パス名か?
		System.out.println( "isDirectory()    ：" + f.isDirectory() ); // フォルダか?
		System.out.println( "isFile()         ：" + f.isFile() ); // ファイルか?
		System.out.println( "isHidden()       ：" + f.isHidden() ); // 隠しファイルか?
		System.out.println( "lastModified()   ：" + f.lastModified() ); // 最終更新日:long型
		System.out.println( "length()         ：" + f.length() ); // 大きさ
		
		//Dateクラスでラップする
		Date lastDate = new Date(f.lastModified());
		//Calendarクラスは抽象クラスなのでインスタンス生成をgetInstanceというクラスメソッドで行う
		Calendar cal = Calendar.getInstance();
		//このCalendarをlastDateで指定された日時に設定する
		cal.setTime(lastDate);
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int milsec = cal.get(Calendar.MILLISECOND);
	
		System.out.println(year+"/"+month+"/"+date+" "+hour+":"+min+":"+sec+"."+milsec);
		
	}
	
	public static void main( String [] args ){
		String fileName = "test1.txt";
		FileInfor01 fileInfo = new FileInfor01(fileName);
	}
}

