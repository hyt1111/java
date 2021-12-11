import java.io.*;

class DataInput{
	
	public static void main( String [] args ){
		
		String filename = "data.bin";

		try{
			FileInputStream fis = new FileInputStream( filename );
			DataInputStream dis = new DataInputStream( fis );

			byte b   = dis.readByte();   // byte�^�f�[�^��ǂ�
			short s  = dis.readShort();  // short�^�f�[�^��ǂ�
			int t    = dis.readInt();    // int�^�f�[�^��ǂ�
			long n   = dis.readLong();   // long�^�f�[�^��ǂ�
			float f  = dis.readFloat();  // float�^�f�[�^��ǂ�
			double x = dis.readDouble(); // double�^�f�[�^��ǂ�
			dis.close(); // �X�g���[���̃N���[�Y

			System.out.println( "b = " + b );
			System.out.println( "s = " + s );
			System.out.println( "t = " + t );
			System.out.println( "n = " + n );
			System.out.println( "f = " + f );
			System.out.println( "x = " + x );
		
		}catch( FileNotFoundException e ){
			
			System.err.println( "(" + filename + ") does not exist." );
		
		}catch( EOFException e ){
		
			System.err.println( "There are no data." );
		
		}catch( IOException e ){
			
			System.err.println( "An I/O error occured." );
		
		}
		
	}
}

