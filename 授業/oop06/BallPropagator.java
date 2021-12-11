public class BallPropagator_19rd142{
	// �N���X�t�B�[���h
	public static double dt;//�v���p�Q�[�^�̔������ԊԊu
	public static int xmin; //���E���W
	public static int xmax;
	public static int ymin;
	public static int ymax;
	
	// �C���X�^���X�t�B�[���h
	private double r; //�{�[���̔��a
	private double x, y; //�{�[���̈ʒu�i���S���W�j
	private double vx, vy;//�{�[���̑��x
	private double ax, ay;//�{�[���̉����x
	
	// �����W��
	double gamma = -0.8;
	
	public void setZvalue_r(double r){ //r��set��get
		this.r = r;
	}  
	public double getZvalue_r(){ 
		return this.r; 
	} 
	
	public void setZvalue_x(double x){ //x��set��get
		this.x = x;
	}  
	public double getZvalue_x(){ 
		return this.x; 
	} 
	
	public void setZvalue_y(double y){ //y��set��get
		this.y = y;
	}  
	public double getZvalue_y(){ 
		return this.y; 
	} 

	public void setZvalue_vx(double vx){ //vx��set��get
		this.vx = vx;
	}  
	public double getZvalue_vx(){ 
		return this.vx; 
	} 

	public void setZvalue_vy(double vy){ //vy��set��get
		this.vy = vy;
	}  
	public double getZvalue_vy(){ 
		return this.vy; 
	} 

	public void setZvalue_ax(double ax){ //ax��set��get
		this.ax = ax;
	}  
	public double getZvalue_ax(){ 
		return this.ax; 
	} 

	public void setZvalue_ay(double ay){ //ay��set��get
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
	// ������BallPropagator �N���X�̃R���X�g���N�^�������Ȃ���
	// �i r, x, y, vx, vy, ax, ay ������������j
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
	//x �������̈ʒu�̍X�V
	public void xUpdate() {

		this.x = this.x+ this.vx * dt;
		//x �����̔��ˁicf. �����W���j
		if(this.x< (double)xmin+this.r ){
			this.vx*= gamma;
			this.x = (double)xmin+this.r;
		}else if((double)xmax-this.r < x ){
			this.vx *= gamma;
			this.x = (double)xmax-this.r;
		}
	}
	//y �������̈ʒu�̍X�V
	public void yUpdate() {
		this.y = this.y+ this.vy * dt;
		//y �����̔��ˁicf. �����W���j
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
	//x �������̑��x�̍X�V
	public void vxUpdate() {
		this.vx = this.vx +this.ax * dt;
		this.ax=0;
		this.ay=9.8;
	}
	
	//y �������̑��x�̍X�V
	public void vyUpdate() {
		this.vy= this.vy + this.ay* dt;
		this.ax=0;
		this.ay=9.8;
	}
}
