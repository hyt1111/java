import javax.swing.*;
class JFrameSample01b extends JFrame{
	JFrameSample01b(){
		//※ this. は省略することができます．
		//フレームサイズの指定（横，縦）[ピクセル]
		this.setSize(500, 400);
		//フレームタイトルの表示
		this.setTitle("Frame title");
		//×ボタンをおすとプログラムを終了します
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String [] args){
		//JFrame クラスのインスタンスを生成
		JFrameSample01b fr = new JFrameSample01b();
		//フレームをディスプレイ画面に表示
		fr.setVisible(true);
	}
}
