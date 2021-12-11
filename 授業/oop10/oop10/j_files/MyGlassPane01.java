import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGlassPane01 extends  MyMenuFrame02 implements ActionListener{
	
	private JLabel label1;
	private JButton dispButton;
	private JButton exitButton;
	
	private JPanel gPane;
	
	MyGlassPane01(String title){
		super(title);
		
		label1 = new JLabel( new ImageIcon( "BAnetwork.jpg" ) );
		add( label1, BorderLayout.CENTER ); // イメージを中央に貼り付ける
		
		dispButton = new JButton( "Display \"Exit\" button" ); // 「表示」ボタン
		dispButton.addActionListener( this ); // リスナーの登録
		add( dispButton, BorderLayout.SOUTH  ); // フレームの下部に貼り付ける
		
		exitButton = new JButton( "Exit" ); // 「終了」ボタン
		exitButton.addActionListener( this ); // リスナーの登録
		
		gPane = (JPanel)this.getGlassPane(); // グラスペインを取り出す
		add( gPane, BorderLayout.NORTH  );
		gPane.add( exitButton ); // 「終了」ボタンをグラスペインに貼り付ける

		pack();
	}

	public void actionPerformed( ActionEvent e ){
		JButton jbtn;
		String name = e.getActionCommand(); // ボタンのテキストを取得する
		if( name.equals( "Display \"Exit\" button" ) ){ // 「表示」ボタンが押されたら
			jbtn = (JButton)e.getSource(); // イベントからJButtonのオブジェクトを取得
			jbtn.setText( "Do not display \"Exit\" button" ); // そのボタンのテキストを「非表示」にする
			gPane.setVisible( true ); // グラスペインを可視にする
		}else if( name.equals( "Do not display \"Exit\" button" ) ){ // 「非表示」ボタンが押されたら
			jbtn = (JButton)e.getSource(); // イベントからJButtonのオブジェクトを取得
			jbtn.setText( "Display \"Exit\" button" ); // そのボタンのテキストを「表示」にする
			gPane.setVisible( false ); // グラスペインを非可視にする
		}else if( name.equals( "Exit" ) ){ // 「終了」ボタンが押されたら
			System.exit( 0 ); // プログラムを終了する
		}else{
			super.actionPerformed( e ); // スーパークラスのハンドラに処理を任せる
		}
	}

	public static void main( String [] args )
	{
		MyGlassPane01 f = new MyGlassPane01("MyGlassPane01");
		f.setVisible( true );
	}
}

