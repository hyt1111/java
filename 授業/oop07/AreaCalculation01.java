class AreaCalculation01{
	public static void main( String [] args ){
		
		//AbstClassSample01�^�z��̒�`�i�C���X�^���X�����ł͂Ȃ��j
		AbstClassSample01 [] ab = new AbstClassSample01[3];
		
		//�C���X�^���X����
		ab[0] = new AreaOfTriangle01( 3.0, 4.0, 5.0 );
		ab[1] = new AreaOfRectangle01( 2.0, 3.0 );
		ab[2] = new AreaOfCircle01( 1.0 );

		double s = 0.0; // �ʐς̍��v
		for( int k = 0; k < ab.length; k++ ){
			s += ab[k].getArea(); // �e�}�`�̖ʐς����v����
		}
		System.out.println( "s = " + s );
		
	}
}

