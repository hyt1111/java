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
		popupMenu.add( popPrintItem ); // �|�b�v�A�b�v
		popupMenu.addSeparator();   
		popupMenu.add( popExitItem );  // ���j���[�쐬

		popCopyItem.addActionListener( this ); // �A�N�V�������X�i�[�̓o�^
		popPrintItem.addActionListener( this ); 
		popExitItem.addActionListener( this );

		addMouseListener( new PopupMenuListener() ); // �}�E�X���X�i�[�̓o�^
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
			super.actionPerformed( e ); // �X�[�p�[�N���X�̃n���h���ɏ�����C����
		}
	}

	// �}�E�X���X�i�[�C�����N���X
	class PopupMenuListener extends MouseAdapter {
		//�}�E�X�{�^���������ꂽ�Ƃ��������ꂽ�Ƃ�����
		//�v���b�g�t�H�[���Ɉˑ�����̂ŗ����p�ӂ��Ă���
		
		//�}�E�X�{�^���������ꂽ�Ƃ�
		public void mousePressed( MouseEvent e ){
			//�|�b�v�A�b�v���j���[���w��
			if( e.isPopupTrigger()){
				popupMenu.show( e.getComponent(), e.getX(), e.getY() );
			}
		}
		//�}�E�X�{�^���������ꂽ�Ƃ�
		public void mouseReleased( MouseEvent e ){
			//�|�b�v�A�b�v���j���[���w��
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

