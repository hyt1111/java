import java.io.*;

class DataInput{
	
	public static void main( String [] args ){
		
		String filename = "data.bin";

		try{
			FileInputStream fis = new FileInputStream( filename );
			DataInputStream dis = new DataInputStream( fis );

			byte b   = dis.readByte();   // byte型データを読む
			short s  = dis.readShort();  // short型データを読む
			int t    = dis.readInt();    // int型データを読む
			long n   = dis.readLong();   // long型データを読む
			float f  = dis.readFloat();  // float型データを読む
			double x = dis.readDouble(); // double型データを読む
			dis.close(); // ストリームのクローズ

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

