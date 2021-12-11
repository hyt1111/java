import java.util.List;
import java.util.LinkedList;

class LinkedListSample01{
	public static void main( String [] args ){
		
		List<String> list = new LinkedList<String>();
		
		//A3������A1�`A6�����X�g�ɒǉ�
		list.add( "A1" );
		list.add( "A2" );
		list.add( "A4" );
		list.add( "A5" );
		list.add( "A6" );
		System.out.println( "[1] " + list );
		
		// �uA4�v�̑O�ɁuB3�v��}��
		int index = list.indexOf( "A4" );
		if( index == -1 ){
			System.err.println( "Error: The element does not exit." );
			System.exit( 1 );
		}
		list.add( index, "B3" );
		System.out.println( "[2] " + list +": Add B3.");
		
		list.remove( "A6" );
		System.out.println( "[3] " + list +": Delete A6. ");	

		list.remove( 0 );
		System.out.println( "[4] " + list +": Delte the 0th element. ");
		
		
		System.out.print( "[5] " );
		int nv = list.size(); // �v�f�����擾
		for( int k = 0; k < nv; k++ ){
			System.out.print( list.get( k ) + "  " );
		}
	}
}
