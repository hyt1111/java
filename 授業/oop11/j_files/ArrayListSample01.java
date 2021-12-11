import java.util.List;
import java.util.ArrayList;

class ArrayListSample01{
	public static void main( String [] args ){
		
		//List ar = new ArrayList(); 
		//ArrayList<String> ar = new ArrayList<String>(); 
		List<String> ar = new ArrayList<String>(); 
		
		
		ar.add( "first" );  // "first"をリストの末尾に追加
		ar.add( "second" ); // "second"をリストの末尾に追加
		ar.add( "third" );  // "third"をリストの末尾に追加
		
		ar.add(0,"aaa");// 0番目に"aaa"を追加
		
		ar.remove(2);

		// 順番に表示
		int kmax = ar.size(); // 登録されている要素数を取得
		for(int k = 0; k < kmax; k++ ){
			String str = (String)ar.get( k ); // k番目のオブジェクトを取得
			System.out.println(str); // それを表示
		}

		System.out.println( ); // 最後に改行を表示
	}
}
