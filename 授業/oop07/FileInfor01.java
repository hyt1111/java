import java.io.*;
import java.util.*;

class FileInfor01{
	FileInfor01(String fileName){
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
		System.out.println( "lastModified()   �F" + f.lastModified() ); // �ŏI�X�V��:long�^
		System.out.println( "length()         �F" + f.length() ); // �傫��
		
		//Date�N���X�Ń��b�v����
		Date lastDate = new Date(f.lastModified());
		//Calendar�N���X�͒��ۃN���X�Ȃ̂ŃC���X�^���X������getInstance�Ƃ����N���X���\�b�h�ōs��
		Calendar cal = Calendar.getInstance();
		//����Calendar��lastDate�Ŏw�肳�ꂽ�����ɐݒ肷��
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

