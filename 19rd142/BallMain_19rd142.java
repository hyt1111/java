import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import p052.*;

public class BallMain_19rd142 extends JPanel implements ActionListener{

	//描画パネルのサイズ
	private int xPanelSize;
	private int yPanelSize;
	//BallPropagator クラスのインスタンス
	BallPropagator_19rd142 b1;
	BallPropagator_19rd142 b2;
	
	//ボールの色
	Color c1;
	Color c2;
	
	//コンストラクタ
	BallMain_19rd142(int xPanelSize, int yPanelSize){
		//描画パネルのサイズ
		this.xPanelSize = xPanelSize;
		this.yPanelSize = yPanelSize;
		
		
		//BallPropagator クラスのインスタンスの生成（ボールの生成）
		//ボールb1 の初期状態（ボールの半径，位置，速度，加速度）
		b1 = new BallPropagator_19rd142(10, 100, 100, 100, -50, 0, 9.8);
		b2 = new BallPropagator_19rd142(10, 10, 10, 100, -50, 0, 9.8);

		c1 = new Color(255, 165, 0);
		c2 = new Color(51, 255, 51);

	}
	
	//イベント（タイマーによる呼び出し）が発生したときの処理
	public void actionPerformed(ActionEvent e){
		//ボールb1 の位置の更新
		b1.xUpdate();
		b1.yUpdate();
		//ボールb1 の速度の更新
		b1.vxUpdate();
		b1.vyUpdate();
		
		//ボールb2 の位置の更新
		b2.xUpdate();
		b2.yUpdate();
		//ボールb2 の速度の更新
		b2.vxUpdate();
		b2.vyUpdate();
		
		// 再描画
		repaint();
	}
	// 描画するときの処理
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//ボールb1の色を設定
		g.setColor(c1);
		//ボールb1を描画
		g.fillOval((int)(b1.getZvalue_x() - b1.getZvalue_r()), (int)(b1.getZvalue_y() - b1.getZvalue_r()),
			(int)(2*b1.getZvalue_r()), (int)(2*b1.getZvalue_r()));
		//ボールb2の色を設定
		g.setColor(c2);
		
		//ボールb2を描画
		g.fillOval((int)(b2.getZvalue_x() - b2.getZvalue_r()), (int)(b2.getZvalue_y() - b2.getZvalue_r()),
			(int)(2*b2.getZvalue_r()), (int)(2*b2.getZvalue_r()));
	}
	// メイン・メソッド
	public static void main(String[] args) {
		MyName pc = new MyName();  
        	System.out.println("製作者："+pc.name);
		FunctionSet07 fs = new FunctionSet07(3.0,1.0,1.0); 
		double x,y,z;
		x = 18; 
		y = fs.f(x); 
		System.out.println("作業時間"+y+"（分）");
		z = 60; 
		y = fs.f(x,z); 
		System.out.println("作業時間"+y+"（分）");
		
		
		//微小時間間隔
		BallPropagator_19rd142.dt=0.1;
		
		// フレームを生成する
		JFrame frame = new JFrame();
		
		// パネルを生成する
		BallMain_19rd142 panel = new BallMain_19rd142(500,400);
		panel.setBackground(Color.white);
		panel.setPreferredSize(
		new Dimension(panel.xPanelSize, panel.yPanelSize));
		
		//ボールの動く範囲を決定する（境界条件）
		BallPropagator_19rd142.xmin = 0;
		BallPropagator_19rd142.xmax = panel.xPanelSize;
		BallPropagator_19rd142.ymin = 0;
		BallPropagator_19rd142.ymax = panel.yPanelSize;
		
		// フレームを設定する
		frame.add(panel);
		frame.pack();
		frame.setTitle("反射するボール");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		
		// イベントを定期的に発生させるためのタイマー
		Timer timer = new Timer(10, panel);
		timer.start();
		
		System.out.println("ボールが落ちるまで暇なのでクイズをしましょう！！！");
		Question[] questions = new Question[] {
			new SimpleQuestion("りんごを表す英単語は", "apple"),
			new SimpleQuestion("みかんを表す英単語は", "orange"),
			new YesNoQuestion("womanの複数形は women", true),
			new YesNoQuestion("forgetの過去形は forgetted", false)
		};
		int score = 0;
	
		for(int i = 0; i < questions.length; i ++) {
				Question question = questions[i];
				System.out.println("第 " + (i + 1) + "問:");
				String input = null;
			do {
				input = MySystem.in.getString(question.getQuestion());
				input = input.trim();
			} while(! question.check(input));
				
			boolean isCorrect = question.isCorrect(input);
			if(isCorrect) {
				System.out.println("正解!");
				score ++;
			} else {
				System.out.println("不正解。正解は " + question.getAnswer() + "でした。");
			}
		}
		System.out.println(questions.length + "問中 " + score + "問正解でした。");
	}
}