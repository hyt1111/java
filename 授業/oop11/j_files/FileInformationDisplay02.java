import java.io.*;
import java.util.*;

class FileInformationDisplay02{
	
	void FileInformationDisplay(String fileName){
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
		System.out.println( "lastModified()   ：" + f.lastModified() ); // 最後の修正日:long型
		System.out.println( "length()         ：" + f.length() ); // 大きさ
		
		Date lastDate = new Date(f.lastModified());
		Calendar cal = Calendar.getInstance();
		cal.setTime(lastDate);
		
		String[] sDate = new String[7]; 
		sDate[0] = Integer.toString(cal.get(Calendar.YEAR))+"年";
		sDate[1] = Integer.toString(cal.get(Calendar.MONTH))+"月";
		sDate[2] = Integer.toString(cal.get(Calendar.DATE))+"日";
		sDate[3] = Integer.toString(cal.get(Calendar.HOUR))+"時";
		sDate[4] = Integer.toString(cal.get(Calendar.MINUTE))+"分";
		sDate[5] = Integer.toString(cal.get(Calendar.SECOND))+"秒";
		sDate[6] = Integer.toString(cal.get(Calendar.MILLISECOND))+"";
		
		/*
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int milsec = cal.get(Calendar.MILLISECOND);
		*/
		
		String strDate = "";
		for(int i=0; i<7; i++){
			strDate = strDate+sDate[i]; 
		}
		
		System.out.println(strDate);
		
	}
	public static void main( String [] args )
	{
		String 
		fileName = "test1.txt";
		FileInformationDisplay02 fileInfo = new FileInformationDisplay02();
		fileInfo.FileInformationDisplay(fileName);
	}
}

