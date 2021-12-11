import java.util.List;
import java.util.ArrayList;

class ArrayListUsage01{
	public static void main( String [] args ){
		
		String [] progLang = { "C", "Pascal", "Fortran", "COBOL", "Java", };
		List<String> list = new ArrayList<String>();
		
		// �v���O���~���O���ꖼ�����X�g�ɒǉ�����
		for(int k = 0; k < progLang.length; k++ ){
			list.add( progLang[k] ); 
		}
		
		// �v�f�����z���Ԃ�
		Object [] array = list.toArray();
		for(int k = 0; k < array.length; k++ ){
			System.out.print(array[k]+"  ");
		}
		System.out.println();

		//���X�g����"Fortran"�������
		if( list.contains( "Fortran" ) ) System.out.println( "Fortran exits." );
		
		// �R���N�V��������"Lisp"���������
		if( !list.contains( "Lisp" ) ) 	System.out.println( "Lisp does not exit." );

		//����v�f�̈ʒu��Ԃ�(�Ȃ����-1)
		int p1 = list.indexOf( "COBOL" ); 
		int p2 = list.indexOf( "Prolog" ); 
		System.out.println( "The position of COBOL is " + p1);
		System.out.println( "The position of Prolog is " + p2 );

		
		// p1�Ԗڂ̗v�f������
		String name1 = (String)list.get( p1 ); 
		list.remove( p1 ); 
		String name2 = (String)list.get( p1 ); 
		System.out.println(name1+ " is deleted, then " + name2 + " is set to the positoin. " );
		
	

		// ���ׂẴf�[�^����苎��
		list.clear(); 
		if(list.isEmpty()) System.out.println( "The list is empty." );
	}
}


