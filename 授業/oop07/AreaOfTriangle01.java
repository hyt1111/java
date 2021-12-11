class AreaOfTriangle01 extends AbstClassSample01{
	
	private double a, b, c; // 三角形の3辺

	// コンストラクタ
	public AreaOfTriangle01( double a, double b, double c ){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// 面積を求める
	public double getArea(){
		double p = ( a + b + c ) / 2.0;
		return Math.sqrt( p * ( p-a ) * ( p-b ) * ( p-c ) );
	}
}

