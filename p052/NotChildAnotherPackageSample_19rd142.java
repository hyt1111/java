package p052;

import p051.*; 

class NotChildAnotherPackageSample extends BaseSample02{ 
	NotChildAnotherPackageSample(){
		this.w = 111;
		this.x = 222; 
		this.setZvalue(333); 
		this.setZvalue(444); 
	} 
	public static void main(String [] args){
		NotChildAnotherPackageSample ncaps = new NotChildAnotherPackageSample();
		System.out.println("w="+ncaps.w);
		System.out.println("x="+ncaps.x);
		System.out.println("y="+ncaps.getZvalue());
		System.out.println("z="+ncaps.getZvalue());
	}
}