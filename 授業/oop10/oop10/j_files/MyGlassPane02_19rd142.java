import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGlassPane02_19rd142 extends  MyMenuFrame02 implements ActionListener{
	
	private JLabel label1;
	private JButton dispButton;
	private JButton exitButton;
	
	private JPanel gPane;
		private JPopupMenu popupMenu = new JPopupMenu( "Pop-up menu" );
	private JMenuItem  popCopyItem  = new JMenuItem( "Copy" );
	private JMenuItem  popPrintItem = new JMenuItem( "Print..." );
	private JMenuItem  popExitItem  = new JMenuItem( "<html><font color=red>Exit" );

	MyGlassPane02_19rd142(String title){
		super(title);
		
		popupMenu.add( popCopyItem );
		popupMenu.add( popPrintItem ); // ポップアップ
		popupMenu.addSeparator();   
		popupMenu.add( popExitItem );  // メニュー作成

		popCopyItem.addActionListener( this ); // アクションリスナーの登録
		popPrintItem.addActionListener( this ); 
		popExitItem.addActionListener( this );

		addMouseListener( new PopupMenuListener() );
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
class PopupMenuListener extends MouseAdapter {
		//マウスボタンが押されたときか離されたときかは
		//プラットフォームに依存するので両方用意しておく
		
		//マウスボタンが押されたとき
		public void mousePressed( MouseEvent e ){
			//ポップアップメニューを指定
			if( e.isPopupTrigger()){
				popupMenu.show( e.getComponent(), e.getX(), e.getY() );
			}
		}
		//マウスボタンが離されたとき
		public void mouseReleased( MouseEvent e ){
			//ポップアップメニューを指定
			if( e.isPopupTrigger()){
				popupMenu.show( e.getComponent(), e.getX(), e.getY() );
			}
		}
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
		MyGlassPane02_19rd142 f = new MyGlassPane02_19rd142("MyGlassPane01");
		f.setVisible( true );
	}
}

