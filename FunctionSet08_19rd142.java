class FunctionSet08 extends FunctionSet06{
double c; 
 
//�R���X�g���N�^ 6-2 //�R���X�g���N�^ 6-1 �̃I�[�o�[���[�h 
FunctionSet08(double a, double b,double c){ 
this.a = a; 
this.b = b; 
this.c = c; 
}
 //���\�b�h 6-1 
//�I�[�o�[���[�h
double f(double x){ 
return a * x *x+ b*x+c; 
}
//�I�[�o�[���C�h
double f(double x,double z,double w){ 
return a * x *x+ b*z*z+c*w*w; 
}
}