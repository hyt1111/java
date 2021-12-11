public class BallPropagator_19rd142{
	// クラスフィールド
	public static double dt;//プロパゲータの微小時間間隔
	public static int xmin; //境界座標
	public static int xmax;
	public static int ymin;
	public static int ymax;
	
	// インスタンスフィールド
	private double r; //ボールの半径
	private double x, y; //ボールの位置（中心座標）
	private double vx, vy;//ボールの速度
	private double ax, ay;//ボールの加速度
	
	// 反発係数
	double gamma = -0.8;
	
	public void setZvalue_r(double r){ //rのsetとget
		this.r = r;
	}  
	public double getZvalue_r(){ 
		return this.r; 
	} 
	
	public void setZvalue_x(double x){ //xのsetとget
		this.x = x;
	}  
	public double getZvalue_x(){ 
		return this.x; 
	} 
	
	public void setZvalue_y(double y){ //yのsetとget
		this.y = y;
	}  
	public double getZvalue_y(){ 
		return this.y; 
	} 

	public void setZvalue_vx(double vx){ //vxのsetとget
		this.vx = vx;
	}  
	public double getZvalue_vx(){ 
		return this.vx; 
	} 

	public void setZvalue_vy(double vy){ //vyのsetとget
		this.vy = vy;
	}  
	public double getZvalue_vy(){ 
		return this.vy; 
	} 

	public void setZvalue_ax(double ax){ //axのsetとget
		this.ax = ax;
	}  
	public double getZvalue_ax(){ 
		return this.ax; 
	} 

	public void setZvalue_ay(double ay){ //ayのsetとget
		this.ay = ay;
	}  
	public double getZvalue_ay(){ 
		return this.ay; 
	}

	BallPropagator(){
		setZvalue_r(10);
		setZvalue_x(100);
		setZvalue_y(100);
		setZvalue_vx(100);
		setZvalue_vy(-50);
		setZvalue_ax(0);
		setZvalue_ay(9.8);
	}


	///////////////////////////////////////////////////////////
	//
	// ここにBallPropagator クラスのコンストラクタを書きなさい
	// （ r, x, y, vx, vy, ax, ay を初期化する）
	BallPropagator_19rd142(double r,double x,double y,double vx,double vy,double ax,double ay ){
		this.r=r;
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
		this.ax=ax;
		this.ay=ay;
	}
	

	//
	///////////////////////////////////////////////////////////
	//x 軸方向の位置の更新
	public void xUpdate() {

		this.x = this.x+ this.vx * dt;
		//x 方向の反射（cf. 反発係数）
		if(this.x< (double)xmin+this.r ){
			this.vx*= gamma;
			this.x = (double)xmin+this.r;
		}else if((double)xmax-this.r < x ){
			this.vx *= gamma;
			this.x = (double)xmax-this.r;
		}
	}
	//y 軸方向の位置の更新
	public void yUpdate() {
		this.y = this.y+ this.vy * dt;
		//y 方向の反射（cf. 反発係数）
		if(this.y < (double)ymin +  this.r){
			// this.vy = ??????????
			this.vy *= gamma;
			this.y = (double)ymin+this.r;
		}else if((double)ymax-this.r< this.y ){
			// this.vy = ??????????
			this.vy *= gamma;
			this.y = (double)ymax-this.r;
		}
	}
	//x 軸方向の速度の更新
	public void vxUpdate() {
		this.vx = this.vx +this.ax * dt;
		this.ax=0;
		this.ay=9.8;
	}
	
	//y 軸方向の速度の更新
	public void vyUpdate() {
		this.vy= this.vy + this.ay* dt;
		this.ax=0;
		this.ay=9.8;
	}
}
