import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPopupMenu01 extends MyMenuFrame02 implements ActionListener
{
	private JPopupMenu popupMenu = new JPopupMenu( "Pop-up menu" );
	private JMenuItem  popCopyItem  = new JMenuItem( "Copy" );
	private JMenuItem  popPrintItem = new JMenuItem( "Print..." );
	private JMenuItem  popExitItem  = new JMenuItem( "<html><font color=red>Exit" );

	MyPopupMenu01(String title){
		super(title);
		popupMenu.add( popCopyItem );
		popupMenu.add( popPrintItem ); // ポップアップ
		popupMenu.addSeparator();   
		popupMenu.add( popExitItem );  // メニュー作成

		popCopyItem.addActionListener( this ); // アクションリスナーの登録
		popPrintItem.addActionListener( this ); 
		popExitItem.addActionListener( this );

		addMouseListener( new PopupMenuListener() ); // マウスリスナーの登録
	}

	public void actionPerformed( ActionEvent e ){
		JMenuItem selectedItem = (JMenuItem)e.getSource();
		if( selectedItem == popCopyItem ){
			System.out.println( "\"Copy\" has been pushed." );
		}else if( selectedItem == popPrintItem){
			System.out.println( "\"Print...\" has been pushed." );
		}else if( selectedItem == popExitItem){
			System.out.println( "\"Exit\" has been pushed." );
			System.exit( 0 );
		}else{
			super.actionPerformed( e ); // スーパークラスのハンドラに処理を任せる
		}
	}

	// マウスリスナー，内部クラス
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

	public static void main( String [] args )
	{
		MyPopupMenu01 f = new MyPopupMenu01("MyPopupMenu01");
		f.setVisible( true );
	}
}

