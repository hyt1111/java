import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class MyCheckBoxMenu01 extends MyCascadeMenu01 implements ActionListener{

	private JMenu checkMenu = new JMenu( "Checkbox menu" );

	//�`�F�b�N�{�b�N�X�t�����j���[����
	private JCheckBoxMenuItem checkItem01 = new JCheckBoxMenuItem( "Box 1" );//�f�t�H���g�ł͔�I��
	private JCheckBoxMenuItem checkItem02 = new JCheckBoxMenuItem( "Box 2", false);//��I��
	private JCheckBoxMenuItem checkItem03 = new JCheckBoxMenuItem( "Box 3", true );//�I��


	MyCheckBoxMenu01(String title){
		super(title);

		checkMenu.add( checkItem01 );
		checkMenu.add( checkItem02);
		checkMenu.add( checkItem03 );

		checkItem01.addActionListener(this);
		checkItem02.addActionListener(this);
		checkItem03.addActionListener(this);

		this.menuBar.add( checkMenu ); // menuBar�̓X�[�p�[�N���X�Œ�`
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
			super.actionPerformed( e ); // �X�[�p�[�N���X�̃n���h���ɏ�����C����
		}
	}

	public static void main( String [] args )
	{
		MyCheckBoxMenu01 f = new MyCheckBoxMenu01("MyCheckBoxMenu01");
		f.setVisible( true );
	}
}


