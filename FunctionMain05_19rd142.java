class FunctionMain05{
	public static void main(String [] args){ 
		FunctionSet05 fs = new FunctionSet05(); 
		double a,b,x,y;

		x = 3.0; 
		y = fs.f(x); 
		a = fs.a;
		b = fs.b;
		System.out.println("a = " +a);
		System.out.println("b = "+b);
		System.out.println("f("+x+") = "+y);
	}
}
