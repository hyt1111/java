import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListSample03{
	public static void main( String [] args ){
		
		//ArrayList<String> ar = new ArrayList<String>(); 
		List<String> ar = new ArrayList<String>(); //List�C���^�[�t�F�[�X
		
		
		ar.add( "first" );  // "first"�����X�g�̖����ɒǉ�
		ar.add( "second" ); // "second"�����X�g�̖����ɒǉ�
		ar.add( "third" );  // "third"�����X�g�̖����ɒǉ�
		
		ar.add(0,"aaa");// 0�Ԗڂ�"aaa"�����X�g�̖����ɒǉ�
		
		ar.remove(2);

		//for���ł͂Ȃ��CIterator�C���^�[�t�F�[�X���g��
		Iterator<String> it = ar.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println(str);
		}
		System.out.println( ); // �Ō�ɉ��s��\��
	}
}
