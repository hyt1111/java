class AreaOfTriangle01 extends AbstClassSample01{
	
	private double a, b, c; // �O�p�`��3��

	// �R���X�g���N�^
	public AreaOfTriangle01( double a, double b, double c ){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// �ʐς����߂�
	public double getArea(){
		double p = ( a + b + c ) / 2.0;
		return Math.sqrt( p * ( p-a ) * ( p-b ) * ( p-c ) );
	}
}

