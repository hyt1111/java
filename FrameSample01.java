import java.awt.Frame; class FrameSample01{ public static void main(String [] args){
//フレームクラスのインスタンスを生成
 Frame fr = new Frame();
//フレームサイズの指定（横，縦）[ピクセル]
 fr.setSize(500, 400); //フレームタイトルの表示
 fr.setTitle("フレームのタイトルが書けます！"); //フレームをディスプレイ画面に表示する
 fr.setVisible(true);
//このフレームの×ボタンは無効なので //Ctrl+C を押してコマンドプロンプトから強制終了します．
}
}