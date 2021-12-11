import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyMenuFrame03 extends MyMenuFrame02{
	
	//カスケードメニュー
	protected JMenu casMenu;
	protected JMenu cas;
	protected JMenuItem casItem01;
	protected JMenuItem casItem02;
	protected JMenuItem casItem03;
	
	//チェックボックスメニュー
	protected JMenu checkMenu;
	protected JCheckBoxMenuItem checkItem01;
	protected JCheckBoxMenuItem checkItem02;
	protected JCheckBoxMenuItem checkItem03;
	
	MyMenuFrame03(String title){
		super(title);
	
		/////////////////////////////////////////////////////////////////////////////
		//カスケードメニュー
		ImageIcon picIcon01  = new ImageIcon( "pic01.gif");
		ImageIcon picIcon02  = new ImageIcon( "pic02.gif");
		ImageIcon picIcon03  = new ImageIcon( "pic03.gif");
		
		casMenu    = new JMenu( "Cascade menu" );
		cas = new JMenu( "Charactor" );
		casItem01 = new JMenuItem( "Charactor 1", picIcon01 );
		casItem02  = new JMenuItem( "Charactor 2", picIcon02 );
		casItem03 = new JMenuItem( "Charactor 3", picIcon03 );
		casMenu.add( cas );
		
		cas.add( casItem01 );
		cas.add( casItem02 );
		cas.add( casItem03 );
		
		MyCascadeMenu cm = new MyCascadeMenu();
		casItem01.addActionListener(cm);
		casItem02.addActionListener(cm);
		casItem03.addActionListener(cm);
		
		menuBar.add( casMenu ); // menuBarはスーパークラスで定義
		/////////////////////////////////////////////////////////////////////////////
		
			
		/////////////////////////////////////////////////////////////////////////////
		//チェックボックスメニュー
		checkMenu = new JMenu( "Checkbox menu" );
		checkItem01 = new JCheckBoxMenuItem( "Box 1" );//デフォルトでは非選択
		checkItem02 = new JCheckBoxMenuItem( "Box 2", false);//非選択
		checkItem03 = new JCheckBoxMenuItem( "Box 3", true );//選択
		
		checkMenu.add( checkItem01 ); // メニューに追加
		checkMenu.add( checkItem02 );
		checkMenu.add( checkItem03 );
		
		MyCheckBoxMenu cbm = new MyCheckBoxMenu();
		checkItem01.addActionListener( cbm ); // リスナーを追加
		checkItem02.addActionListener( cbm );
		checkItem03.addActionListener( cbm );

		menuBar.add( checkMenu ); // menuBarはスーパークラスで定義
		/////////////////////////////////////////////////////////////////////////////
	}
	

	public void actionPerformed(ActionEvent e){
			super.actionPerformed( e ); // スーパークラスのハンドラに処理を任せる
	}
		
	public class MyCascadeMenu implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			JMenuItem selectedItem = (JMenuItem)e.getSource();
			if(selectedItem == casItem01){
				JOptionPane.showMessageDialog(null, "Charactor 1 has been chosen!");
			}else if(selectedItem == casItem02){
				JOptionPane.showMessageDialog(null, "Charactor 2 has been chosen!");
			}else if(selectedItem == casItem03){
				JOptionPane.showMessageDialog(null, "Charactor 3 has been chosen!");	
			}
		}
	}
	
	public class MyCheckBoxMenu implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			JMenuItem selectedItem = (JMenuItem)e.getSource();
			if( selectedItem == checkItem01 || selectedItem == checkItem02 || selectedItem == checkItem03 ){
				String name = e.getActionCommand();
				if(selectedItem.isSelected()){
					System.out.println( "\"" + name + "\" has been checked. ");
				}else{
					System.out.println( "\"" + name + "\" has been unchecked. ");
				}
			}
		}
	}

	public static void main( String [] args )
	{
		MyMenuFrame03 f = new MyMenuFrame03("MyMenuFrame03");
		f.setVisible( true );
	}
}
