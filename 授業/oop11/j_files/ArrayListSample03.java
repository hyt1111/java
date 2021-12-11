import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListSample03{
	public static void main( String [] args ){
		
		//ArrayList<String> ar = new ArrayList<String>(); 
		List<String> ar = new ArrayList<String>(); //Listインターフェース
		
		
		ar.add( "first" );  // "first"をリストの末尾に追加
		ar.add( "second" ); // "second"をリストの末尾に追加
		ar.add( "third" );  // "third"をリストの末尾に追加
		
		ar.add(0,"aaa");// 0番目に"aaa"をリストの末尾に追加
		
		ar.remove(2);

		//for文ではなく，Iteratorインターフェースを使う
		Iterator<String> it = ar.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println(str);
		}
		System.out.println( ); // 最後に改行を表示
	}
}
