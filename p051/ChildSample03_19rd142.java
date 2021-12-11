package p051; 
 
class ChildSample03_19rd142 extends BaseSample02{ 
//コンストラクタ 
	ChildSample03_19rd142(){
		this.w = 1; 
		this.x = 2; 
		this.y = 3; 
		//this.z = 4; 
		this.setZvalue(4);
	} 
	public static void main(String [] args){
		ChildSample03_19rd142 cs = new ChildSample03_19rd142();
		System.out.println("w="+cs.w);
		System.out.println("x="+cs.x);
		System.out.println("y="+cs.getZvalue());
		System.out.println("z="+cs.getZvalue());
		
	}

}