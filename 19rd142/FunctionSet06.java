class FunctionSet06{ 
	double a; 
	double b; 
	//�R���X�g���N�^ 6-1 
	FunctionSet06(){ 
		this.a = 1.0; 
		this.b = 0.0; 
	}
	 //�R���X�g���N�^ 6-2 
	//�R���X�g���N�^ 6-1 �̃I�[�o�[���[�h
	FunctionSet06(double a, double b){ 
		this.a = a; 
		this.b = b; 
	} 
	//���\�b�h 6-1 
	double f(double x){ 
		return a * x + b; 
	}
} 