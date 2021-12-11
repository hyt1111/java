import java.io.*;
import java.util.*;

class FileInfor03_19rd142{
	String DateToString(Date dt) {
		//Calendarクラスは抽象クラスなのでインスタンス生成をgetInstanceというクラスメソッドで行う
		Calendar cal = Calendar.getInstance();
		//このCalendarをlastDateで指定された日時に設定する
		cal.setTime(dt);
		
		String[] sDate = new String[7]; 
		sDate[0] = String.valueOf(cal.get(Calendar.YEAR))+"/";
		sDate[1] = String.valueOf(cal.get(Calendar.MONTH)+1)+"/";
		sDate[2] = String.valueOf(cal.get(Calendar.DATE))+" ";
		sDate[3] = String.valueOf(cal.get(Calendar.HOUR))+":";
		sDate[4] = String.valueOf(cal.get(Calendar.MINUTE))+":";
		sDate[5] = String.valueOf(cal.get(Calendar.SECOND))+".";
		sDate[6] = String.valueOf(cal.get(Calendar.MILLISECOND));
				
		String strDate = "";
		for(int i=0; i<7; i++){
			strDate = strDate+sDate[i]; 
		}
		return strDate;
	}

	FileInfor03_19rd142(String fileName){
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
		String strDate = "";
		strDate = DateToString(lastDate); 
		System.out.println(strDate);
	}
	public static void main( String [] args ){
		String fileName = "test1.txt";
		FileInfor03_19rd142 fileInfo = new FileInfor03_19rd142(fileName);
	}
}

