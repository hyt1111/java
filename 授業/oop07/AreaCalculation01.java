class AreaCalculation01{
	public static void main( String [] args ){
		
		//AbstClassSample01型配列の定義（インスタンス生成ではない）
		AbstClassSample01 [] ab = new AbstClassSample01[3];
		
		//インスタンス生成
		ab[0] = new AreaOfTriangle01( 3.0, 4.0, 5.0 );
		ab[1] = new AreaOfRectangle01( 2.0, 3.0 );
		ab[2] = new AreaOfCircle01( 1.0 );

		double s = 0.0; // 面積の合計
		for( int k = 0; k < ab.length; k++ ){
			s += ab[k].getArea(); // 各図形の面積を合計する
		}
		System.out.println( "s = " + s );
		
	}
}

