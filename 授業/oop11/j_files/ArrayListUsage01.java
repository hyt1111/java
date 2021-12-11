import java.util.List;
import java.util.ArrayList;

class ArrayListUsage01{
	public static void main( String [] args ){
		
		String [] progLang = { "C", "Pascal", "Fortran", "COBOL", "Java", };
		List<String> list = new ArrayList<String>();
		
		// プログラミング言語名をリストに追加する
		for(int k = 0; k < progLang.length; k++ ){
			list.add( progLang[k] ); 
		}
		
		// 要素を持つ配列を返す
		Object [] array = list.toArray();
		for(int k = 0; k < array.length; k++ ){
			System.out.print(array[k]+"  ");
		}
		System.out.println();

		//リスト中に"Fortran"があれば
		if( list.contains( "Fortran" ) ) System.out.println( "Fortran exits." );
		
		// コレクション中に"Lisp"が無ければ
		if( !list.contains( "Lisp" ) ) 	System.out.println( "Lisp does not exit." );

		//特定要素の位置を返す(なければ-1)
		int p1 = list.indexOf( "COBOL" ); 
		int p2 = list.indexOf( "Prolog" ); 
		System.out.println( "The position of COBOL is " + p1);
		System.out.println( "The position of Prolog is " + p2 );

		
		// p1番目の要素を消去
		String name1 = (String)list.get( p1 ); 
		list.remove( p1 ); 
		String name2 = (String)list.get( p1 ); 
		System.out.println(name1+ " is deleted, then " + name2 + " is set to the positoin. " );
		
	

		// すべてのデータを取り去る
		list.clear(); 
		if(list.isEmpty()) System.out.println( "The list is empty." );
	}
}


