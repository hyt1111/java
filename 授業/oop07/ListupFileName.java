import java.io.*;

class ListupFileName{
	public static void main( String [] args ){
		
		String folder = "."; // �ꗗ��\������t�H���_(���̗�ł̓J�����g�t�H���_�Ƃ��Ă���)
		File f = new File( folder ); // ���̃t�H���_���̃t�@�C�����𓾂�
		
		String [] files = f.list(); // �t�@�C���̃��X�g�ꗗ�𓾂�
		int n = files.length; // �t�@�C�����𓾂�

		System.out.println( "In folder " + folder + ", the number of files is " + n + ".");
		System.out.println( "The files are as follows: " );
		for( int k = 0; k < n; k++ ){
			System.out.println( folder + "/" + files[k] ); // k�Ԗڂ̃t�@�C����\������
		}
	}
}

