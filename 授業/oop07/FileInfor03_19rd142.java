import java.io.*;
import java.util.*;

class FileInfor03_19rd142{
	String DateToString(Date dt) {
		//Calendar�N���X�͒��ۃN���X�Ȃ̂ŃC���X�^���X������getInstance�Ƃ����N���X���\�b�h�ōs��
		Calendar cal = Calendar.getInstance();
		//����Calendar��lastDate�Ŏw�肳�ꂽ�����ɐݒ肷��
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
		String strDate = "";
		strDate = DateToString(lastDate); 
		System.out.println(strDate);
	}
	public static void main( String [] args ){
		String fileName = "test1.txt";
		FileInfor03_19rd142 fileInfo = new FileInfor03_19rd142(fileName);
	}
}

