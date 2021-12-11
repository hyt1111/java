class FunctionSet07 extends FunctionSet06{ 
	double c;
	FunctionSet07(double a, double b, double c){ 
		this.a = a; 
		this.b = b; 
		this.c = c; 
	} 
	double f(double x){ 
		return x*60; 
	} 
	double f(double x, double z){ 
		return x*60*z; 
	}
}
