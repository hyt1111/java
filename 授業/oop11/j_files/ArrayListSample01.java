import java.util.List;
import java.util.ArrayList;

class ArrayListSample01{
	public static void main( String [] args ){
		
		//List ar = new ArrayList(); 
		//ArrayList<String> ar = new ArrayList<String>(); 
		List<String> ar = new ArrayList<String>(); 
		
		
		ar.add( "first" );  // "first"�����X�g�̖����ɒǉ�
		ar.add( "second" ); // "second"�����X�g�̖����ɒǉ�
		ar.add( "third" );  // "third"�����X�g�̖����ɒǉ�
		
		ar.add(0,"aaa");// 0�Ԗڂ�"aaa"��ǉ�
		
		ar.remove(2);

		// ���Ԃɕ\��
		int kmax = ar.size(); // �o�^����Ă���v�f�����擾
		for(int k = 0; k < kmax; k++ ){
			String str = (String)ar.get( k ); // k�Ԗڂ̃I�u�W�F�N�g���擾
			System.out.println(str); // �����\��
		}

		System.out.println( ); // �Ō�ɉ��s��\��
	}
}
