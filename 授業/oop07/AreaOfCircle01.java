class AreaOfCircle01 extends AbstClassSample01{
	
	private double r; // �~�̔��a

	// �R���X�g���N�^
	public AreaOfCircle01( double r ) {
		this.r = r;
	}

	//�~�̖ʐ�
	public double getArea(){
		return Math.PI * r * r;
	}
}


