import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class MyCheckBoxMenu01 extends MyCascadeMenu01 implements ActionListener{

	private JMenu checkMenu = new JMenu( "Checkbox menu" );

	//チェックボックス付きメニュー項目
	private JCheckBoxMenuItem checkItem01 = new JCheckBoxMenuItem( "Box 1" );//デフォルトでは非選択
	private JCheckBoxMenuItem checkItem02 = new JCheckBoxMenuItem( "Box 2", false);//非選択
	private JCheckBoxMenuItem checkItem03 = new JCheckBoxMenuItem( "Box 3", true );//選択


	MyCheckBoxMenu01(String title){
		super(title);

		checkMenu.add( checkItem01 );
		checkMenu.add( checkItem02);
		checkMenu.add( checkItem03 );

		checkItem01.addActionListener(this);
		checkItem02.addActionListener(this);
		checkItem03.addActionListener(this);

		this.menuBar.add( checkMenu ); // menuBarはスーパークラスで定義
	}

	public void actionPerformed( ActionEvent e ){
		JMenuItem selectedItem = (JMenuItem)e.getSource();
		if( selectedItem == checkItem01 || selectedItem == checkItem02 || selectedItem == checkItem03 )
		{
			String name = e.getActionCommand();
			if(selectedItem.isSelected()){
				System.out.println( "\"" + name + "\" has been checked. ");
			}else{
				System.out.println( "\"" + name + "\" has been unchecked. ");
			}
		}else{
			super.actionPerformed( e ); // スーパークラスのハンドラに処理を任せる
		}
	}

	public static void main( String [] args )
	{
		MyCheckBoxMenu01 f = new MyCheckBoxMenu01("MyCheckBoxMenu01");
		f.setVisible( true );
	}
}


