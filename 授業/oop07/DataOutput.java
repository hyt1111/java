import java.io.*;

class DataOutput{
	public static void main( String [] args ){
		
		String filename = "data.bin"; // �����o���t�@�C����

		byte b = 123;
		short s = 12345;
		int t = 123456789;
		long n = 1234567890123L;
		float f = 1.2345F;
		double x = 1.23456789;

		try{
			//�t�@�C�����o�͂���X�g���[��
			FileOutputStream fos = new FileOutputStream( filename );
			//�v���~�e�B�u�^���o�͂���X�g���[��
			DataOutputStream dos = new DataOutputStream( fos );

			dos.writeByte( b );
			dos.writeShort( s );
			dos.writeInt( t );
			dos.writeLong( n );
			dos.writeFloat( f );
			dos.writeDouble( x );
			dos.writeBoolean( true );
			dos.writeBoolean( false );
			
			dos.close();
			System.out.println( filename+" is closed." );
		
		}catch( IOException e ){
			System.err.println( "An I/O error occured. " );
		}
		
	}
}
