import java.util.List;
import java.util.ArrayList;

class ArrayListSample02{
	public static void main( String [] args ){
		
		//ArrayList<String> ar = new ArrayList<String>(); 
		List<String> arStr = new ArrayList<String>(); 
		List<Integer> arInt = new ArrayList<Integer>(); 
		
		arStr.add( "first" );  // "first"�����X�g�̖����ɒǉ�
		arStr.add( "second" ); // "second"�����X�g�̖����ɒǉ�
		arStr.add( "third" );  // "third"�����X�g�̖����ɒǉ�
		
		arStr.add(0,"aaa");// 0�Ԗڂ�"aaa"�����X�g�̖����ɒǉ�
		
		arStr.remove(2);

		// ���Ԃɕ\��
		int ns = arStr.size(); // �o�^����Ă���v�f�����擾
		for(int k = 0; k < ns; k++ ){
			String str = (String)arStr.get( k ); // k�Ԗڂ̃I�u�W�F�N�g���擾
			System.out.println(str); // �����\��
		}
		System.out.println( ); // �Ō�ɉ��s��\��
		
		
		arInt.add(10);
		arInt.add(20);
		arInt.add(30); 
		
		arInt.add(0, 40);


		// ���Ԃɕ\��
		int ni = arInt.size(); // �o�^����Ă���v�f�����擾
		for(int k = 0; k < ni; k++ ){
			Integer i = (Integer)arInt.get( k ); // k�Ԗڂ̃I�u�W�F�N�g���擾
			System.out.println(i); // �����\��
		}

		System.out.println( ); // �Ō�ɉ��s��\��
	}
}
