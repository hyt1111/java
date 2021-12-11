import java.util.List;
import java.util.Vector;

class VectorSample01{
	public static void main( String [] args ){
		
		List<Integer> vc = new Vector<Integer>(); 

		int kmax = 15;
		for(int k = 1; k<=kmax; k++){
			vc.add(k * 10);  // "first"をリストの末尾に追加
		}

		// 順番に表示1:getメソッドを利用
		int nv = vc.size(); // 要素数を取得
		for( int k = 0; k < nv; k++ ){
			System.out.println( vc.get( k ) );
		}
		System.out.println( ); 
	}
}
