import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyCascadeMenu01 extends MyMenuFrame02{
	private JMenu charaMenu;
	private JMenu chara;
	private JMenuItem charaItem01;
	private JMenuItem charaItem02;
	private JMenuItem charaItem03;
	
	MyCascadeMenu01(String title){
		super(title);
	
		ImageIcon picIcon01  = new ImageIcon( "pic01.gif");
		ImageIcon picIcon02  = new ImageIcon( "pic02.gif");
		ImageIcon picIcon03  = new ImageIcon( "pic03.gif");


		charaMenu    = new JMenu( "Cascade menu" );
		chara = new JMenu( "Charactor" );
		charaItem01 = new JMenuItem( "Charactor 1", picIcon01 );
		charaItem02  = new JMenuItem( "Charactor 2", picIcon02 );
		charaItem03 = new JMenuItem( "Charactor 3", picIcon03 );

		charaMenu.add( chara );
		chara.add( charaItem01 );
		chara.add( charaItem02 );
		chara.add( charaItem03 );
		
		charaItem01.addActionListener(this);
		charaItem02.addActionListener(this);
		//charaItem03.addActionListener(this);
		
		this.menuBar.add( charaMenu ); // menuBarはスーパークラスで定義
	}
	
	public void actionPerformed(ActionEvent e){
		
		JMenuItem selectedItem = (JMenuItem)e.getSource();
		if(selectedItem == charaItem01){
			JOptionPane.showMessageDialog(null, "Charactor 1 has been chosen!");
		}else if(selectedItem == charaItem02){
			JOptionPane.showMessageDialog(null, "Charactor 2 has been chosen!");
		}else if(selectedItem == charaItem03){
			JOptionPane.showMessageDialog(null, "Charactor 3 has been chosen!");
		}else{
			super.actionPerformed( e ); // スーパークラスのハンドラに処理を任せる
		}
	}

	public static void main( String [] args )
	{
		MyCascadeMenu01 f = new MyCascadeMenu01("MyCascadeMenu01");
		f.setVisible( true );
	}
}
