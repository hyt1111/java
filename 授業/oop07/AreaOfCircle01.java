class AreaOfCircle01 extends AbstClassSample01{
	
	private double r; // 円の半径

	// コンストラクタ
	public AreaOfCircle01( double r ) {
		this.r = r;
	}

	//円の面積
	public double getArea(){
		return Math.PI * r * r;
	}
}


