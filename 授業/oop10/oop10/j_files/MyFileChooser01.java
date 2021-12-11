import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

class MyFileChooser01 extends MyMenuFrame02 implements ActionListener{

	private JFileChooser fc = null; // ファイルチューザ
	private JMenuItem openItem;
	JLabel label1;
	JLabel label2;

	MyFileChooser01(String title){
		super(title);

		openItem = new JMenuItem("Open...");
		openItem.addActionListener( this );
		menu.insert( openItem, 0 );    // 「開く」メニューを最初に配置
		menu.insertSeparator( 1 ); // 次にセパレータを配置
	}

	public void actionPerformed( ActionEvent e ){
		String name = e.getActionCommand();
		if( name.equals( "Open..." ) ){
			fc = new JFileChooser( "." ); // カレントディレクトリでファイルチューザ生成
			fc.setDialogTitle( "Open an image file. " ); // ダイアログのタイトル設定
			int ret = fc.showOpenDialog( this ); // ファイルチューザ起動
			
			if( ret == JFileChooser.APPROVE_OPTION ){ // ファイルが選択されたなら
				File file = fc.getSelectedFile(); // そのファイルを取り出して
				String fname = file.getAbsolutePath(); // 文字列(ファイル名)に変換して
				System.out.println( "Selected file name: " + fname ); // それを表示
				
				label1 = new JLabel( new ImageIcon( fname ) );
				label2 = new JLabel( fname );

				add( label1, BorderLayout.CENTER ); // 中央に写真を配置
				add( label2, BorderLayout.NORTH  ); // テキストを上に配置
				pack();
				setVisible(true);

			}else{
				System.out.println( "Undone" );
			}

		}else{
			super.actionPerformed( e );
		}
	}

	public static void main( String [] args ){
		MyFileChooser01 f = new MyFileChooser01("MyFileChooser01");
		f.setVisible( true );
	}
}

