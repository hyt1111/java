import java.io.*;
import java.util.*;

class FileInformationDisplay02{
	
	void FileInformationDisplay(String fileName){
		File f = new File( fileName ); // �w�肳�ꂽ�t�@�C�������擾����
		System.out.println( "exists()         �F" + f.exists() ); // ���݂��邩?
		System.out.println( "getName()        �F" + f.getName() ); // ���O
		System.out.println( "canRead()        �F" + f.canRead() ); // �ǂ߂邩?
		System.out.println( "canWrite()       �F" + f.canWrite() ); // �����邩?
		System.out.println( "getAbsolutePath()�F" + f.getAbsolutePath() ); // ��΃p�X
		System.out.println( "getPath()        �F" + f.getPath() ); // �p�X
		System.out.println( "isAbsolute()     �F" + f.isAbsolute() ); // ��΃p�X����?
		System.out.println( "isDirectory()    �F" + f.isDirectory() ); // �t�H���_��?
		System.out.println( "isFile()         �F" + f.isFile() ); // �t�@�C����?
		System.out.println( "isHidden()       �F" + f.isHidden() ); // �B���t�@�C����?
		System.out.println( "lastModified()   �F" + f.lastModified() ); // �Ō�̏C����:long�^
		System.out.println( "length()         �F" + f.length() ); // �傫��
		
		Date lastDate = new Date(f.lastModified());
		Calendar cal = Calendar.getInstance();
		cal.setTime(lastDate);
		
		String[] sDate = new String[7]; 
		sDate[0] = Integer.toString(cal.get(Calendar.YEAR))+"�N";
		sDate[1] = Integer.toString(cal.get(Calendar.MONTH))+"��";
		sDate[2] = Integer.toString(cal.get(Calendar.DATE))+"��";
		sDate[3] = Integer.toString(cal.get(Calendar.HOUR))+"��";
		sDate[4] = Integer.toString(cal.get(Calendar.MINUTE))+"��";
		sDate[5] = Integer.toString(cal.get(Calendar.SECOND))+"�b";
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

