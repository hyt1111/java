import java.awt.*; 
import javax.swing.*;
public class ManyOvalSample_19rd142 extends JPanel{
// 描画するときの処理 // paintComponent メソッドのオーバーライド

	public void paintComponent(Graphics g){
 //javax.swing.JComponent クラスのメソッド 
		super.paintComponent(g);
			int [] A=new int [3];
				for(int i=0;i<30;i++){
					for(int j=0;j<3;j++){
						A[j]=(int)(Math.random()*255);
					}
					g.setColor(new Color(A[0],A[1],A[2],70));
					g.fillOval(A[0],A[1],A[2],A[2]);
				}
	}

	public static void main(String[] args){
	// フレームを生成する
		JFrame fr = new JFrame(); // パネルを生成する JPanel panel = new JPanel();
		ManyOvalSample_19rd142 panel = new ManyOvalSample_19rd142();
		//パネルサイズを決めるため
		panel.setPreferredSize(new Dimension(500, 400));
		//Dimension dim = new Dimension(500, 400); //panel.setPreferredSize(dim);
		panel.setBackground(Color.white);

		// フレームを設定する
		fr.add(panel);//パネルをフレームにはめ込む 
		fr.pack(); //パネル panel の大きさに合わせてフレーム fr の大きさを決める
		fr.setTitle("円の描画");//タイトルの表示 //×ボタンでプログラムを終了させる 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(true);//フレームサイズを可変 (true) ／不変 (false) にする 
		fr.setVisible(true);//フレームを画面に表示させる
	}
}
