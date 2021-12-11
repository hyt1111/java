import java.util.*;

class StackSample01{
	public static void main( String [] args ){
		
		//Stackクラス:Vectorクラスにpopメソッド,pushメソッドを追加したクラス
		Stack<String> stack = new Stack<String>();

		stack.push( "first" );  // スタックに積む
		stack.push( "second" ); // スタックに積む
		stack.push( "third" );  // スタックに積む

		String topValue = (String)stack.peek(); // 先頭の要素を得る
		System.out.println( "peekメソッド：先頭要素を取りだす: " + topValue );
		System.out.println();
		
		System.out.println( "searchメソッドは先頭から末尾に向かって1,2,3,...");		
		System.out.println( "indexOfメソッドは末尾から先頭に向かって0,1,2,...");	
		
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
		
		// 順番に表示
		int kmax = stack.size();
		for( int k = 0; k < kmax; k++ ){
			String str = (String)stack.pop();
			System.out.println(str);
		}
		System.out.println();

		//emptyメソッド：スタックが空ならばtrue，空でないならばfalseを返す
		if( stack.empty() )
			System.out.println( "スタックが空になりました。" );
	}
}


