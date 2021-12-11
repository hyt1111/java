class FunctionSet08 extends FunctionSet06{
double c; 
 
//コンストラクタ 6-2 //コンストラクタ 6-1 のオーバーロード 
FunctionSet08(double a, double b,double c){ 
this.a = a; 
this.b = b; 
this.c = c; 
}
 //メソッド 6-1 
//オーバーロード
double f(double x){ 
return a * x *x+ b*x+c; 
}
//オーバーライド
double f(double x,double z,double w){ 
return a * x *x+ b*z*z+c*w*w; 
}
}