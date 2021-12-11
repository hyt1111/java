class AreaOfRectangle01 extends AbstClassSample01{
	
	private double a, b; // 四角形の2辺

	// コンストラクタ
	public AreaOfRectangle01( double a, double b ){
		this.a = a;
		this.b = b;
	}

	// 面積を求める
	public double getArea(){
		return a * b;
	}
}

