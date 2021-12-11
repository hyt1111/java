class FunctionSet06{ 
	double a; 
	double b; 
	//コンストラクタ 6-1 
	FunctionSet06(){ 
		this.a = 1.0; 
		this.b = 0.0; 
	}
	 //コンストラクタ 6-2 
	//コンストラクタ 6-1 のオーバーロード
	FunctionSet06(double a, double b){ 
		this.a = a; 
		this.b = b; 
	} 
	//メソッド 6-1 
	double f(double x){ 
		return a * x + b; 
	}
} 