class FunctionMain08{
 public static void main(String [] args)
{ 
FunctionSet08 fs1 = new FunctionSet08(1.0,2.0,3.0); 
FunctionSet08 fs2 = new FunctionSet08(3.0,5.0,7.0);
double x,y,z,w;
x = 2.0;
z = 4.0;
w = 1.0;

y = fs1.f(x,z,w); 
System.out.println("f("+x+") = "+y);
y = fs2.f(x,z,w); 
System.out.println("f("+x+") = "+y);
}
}