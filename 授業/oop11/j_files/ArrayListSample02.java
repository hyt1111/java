import java.util.List;
import java.util.ArrayList;

class ArrayListSample02{
	public static void main( String [] args ){
		
		//ArrayList<String> ar = new ArrayList<String>(); 
		List<String> arStr = new ArrayList<String>(); 
		List<Integer> arInt = new ArrayList<Integer>(); 
		
		arStr.add( "first" );  // "first"をリストの末尾に追加
		arStr.add( "second" ); // "second"をリストの末尾に追加
		arStr.add( "third" );  // "third"をリストの末尾に追加
		
		arStr.add(0,"aaa");// 0番目に"aaa"をリストの末尾に追加
		
		arStr.remove(2);

		// 順番に表示
		int ns = arStr.size(); // 登録されている要素数を取得
		for(int k = 0; k < ns; k++ ){
			String str = (String)arStr.get( k ); // k番目のオブジェクトを取得
			System.out.println(str); // それを表示
		}
		System.out.println( ); // 最後に改行を表示
		
		
		arInt.add(10);
		arInt.add(20);
		arInt.add(30); 
		
		arInt.add(0, 40);


		// 順番に表示
		int ni = arInt.size(); // 登録されている要素数を取得
		for(int k = 0; k < ni; k++ ){
			Integer i = (Integer)arInt.get( k ); // k番目のオブジェクトを取得
			System.out.println(i); // それを表示
		}

		System.out.println( ); // 最後に改行を表示
	}
}
