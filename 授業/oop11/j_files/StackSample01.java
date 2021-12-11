import java.util.*;

class StackSample01{
	public static void main( String [] args ){
		
		//Stack�N���X:Vector�N���X��pop���\�b�h,push���\�b�h��ǉ������N���X
		Stack<String> stack = new Stack<String>();

		stack.push( "first" );  // �X�^�b�N�ɐς�
		stack.push( "second" ); // �X�^�b�N�ɐς�
		stack.push( "third" );  // �X�^�b�N�ɐς�

		String topValue = (String)stack.peek(); // �擪�̗v�f�𓾂�
		System.out.println( "peek���\�b�h�F�擪�v�f����肾��: " + topValue );
		System.out.println();
		
		System.out.println( "search���\�b�h�͐擪���疖���Ɍ�������1,2,3,...");		
		System.out.println( "indexOf���\�b�h�͖�������擪�Ɍ�������0,1,2,...");	
		
		int s4 = stack.search( "nothing");
		int i4 = stack.indexOf( "nothing"  );	
		System.out.println("nothing: s4=" + s4 + ", i4=" + i4);		
		
		int s3 = stack.search( "third" );
		int i3 = stack.indexOf( "third"  );	
		System.out.println("third  : s3= " + s3 + ", i3= " + i3);		
						
		int s2 = stack.search( "second" );
		int i2 = stack.indexOf("second" );	
		System.out.println("second : s2= " + s2 + ", i2= " + i2);		
		
		int s1 = stack.search( "first" );
		int i1 = stack.indexOf( "first" );
		System.out.println("first  : s1= " + s1 + ", i1= " + i1);		

		System.out.println( );	
		
		// ���Ԃɕ\��
		int kmax = stack.size();
		for( int k = 0; k < kmax; k++ ){
			String str = (String)stack.pop();
			System.out.println(str);
		}
		System.out.println();

		//empty���\�b�h�F�X�^�b�N����Ȃ��true�C��łȂ��Ȃ��false��Ԃ�
		if( stack.empty() )
			System.out.println( "�X�^�b�N����ɂȂ�܂����B" );
	}
}


