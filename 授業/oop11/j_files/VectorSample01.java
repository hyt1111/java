import java.util.List;
import java.util.Vector;

class VectorSample01{
	public static void main( String [] args ){
		
		List<Integer> vc = new Vector<Integer>(); 

		int kmax = 15;
		for(int k = 1; k<=kmax; k++){
			vc.add(k * 10);  // "first"�����X�g�̖����ɒǉ�
		}

		// ���Ԃɕ\��1:get���\�b�h�𗘗p
		int nv = vc.size(); // �v�f�����擾
		for( int k = 0; k < nv; k++ ){
			System.out.println( vc.get( k ) );
		}
		System.out.println( ); 
	}
}
