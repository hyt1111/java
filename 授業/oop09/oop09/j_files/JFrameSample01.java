import javax.swing.*;

class JFrameSample01{
	public static void main(String [] args){
		//JFrame クラスのインスタンスを生成
		JFrame fr = new JFrame();
		//フレームサイズの指定（横，縦）[ピクセル]
		fr.setSize(500, 400);
		//フレームタイトルの表示
		fr.setTitle("Frame title");
		//×ボタンをおすとプログラムを終了します
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//フレームをディスプレイ画面に表示します
		fr.setVisible(true);
	}
}
