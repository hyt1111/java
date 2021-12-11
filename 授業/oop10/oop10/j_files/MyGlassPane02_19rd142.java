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
		popupMenu.add( popPrintItem ); // �|�b�v�A�b�v
		popupMenu.addSeparator();   
		popupMenu.add( popExitItem );  // ���j���[�쐬

		popCopyItem.addActionListener( this ); // �A�N�V�������X�i�[�̓o�^
		popPrintItem.addActionListener( this ); 
		popExitItem.addActionListener( this );

		addMouseListener( new PopupMenuListener() );
		label1 = new JLabel( new ImageIcon( "BAnetwork.jpg" ) );
		add( label1, BorderLayout.CENTER ); // �C���[�W�𒆉��ɓ\��t����
		
		dispButton = new JButton( "Display \"Exit\" button" ); // �u�\���v�{�^��
		dispButton.addActionListener( this ); // ���X�i�[�̓o�^
		add( dispButton, BorderLayout.SOUTH  ); // �t���[���̉����ɓ\��t����
		
		exitButton = new JButton( "Exit" ); // �u�I���v�{�^��
		exitButton.addActionListener( this ); // ���X�i�[�̓o�^
		
		gPane = (JPanel)this.getGlassPane(); // �O���X�y�C�������o��
		add( gPane, BorderLayout.NORTH  );
		gPane.add( exitButton ); // �u�I���v�{�^�����O���X�y�C���ɓ\��t����

		pack();
	}
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
	public void actionPerformed( ActionEvent e ){
		JButton jbtn;
		String name = e.getActionCommand(); // �{�^���̃e�L�X�g���擾����
		if( name.equals( "Display \"Exit\" button" ) ){ // �u�\���v�{�^���������ꂽ��
			jbtn = (JButton)e.getSource(); // �C�x���g����JButton�̃I�u�W�F�N�g���擾
			jbtn.setText( "Do not display \"Exit\" button" ); // ���̃{�^���̃e�L�X�g���u��\���v�ɂ���
			gPane.setVisible( true ); // �O���X�y�C�������ɂ���
		}else if( name.equals( "Do not display \"Exit\" button" ) ){ // �u��\���v�{�^���������ꂽ��
			jbtn = (JButton)e.getSource(); // �C�x���g����JButton�̃I�u�W�F�N�g���擾
			jbtn.setText( "Display \"Exit\" button" ); // ���̃{�^���̃e�L�X�g���u�\���v�ɂ���
			gPane.setVisible( false ); // �O���X�y�C�������ɂ���
		}else if( name.equals( "Exit" ) ){ // �u�I���v�{�^���������ꂽ��
			System.exit( 0 ); // �v���O�������I������
		}else{
			super.actionPerformed( e ); // �X�[�p�[�N���X�̃n���h���ɏ�����C����
		}
	}

	public static void main( String [] args )
	{
		MyGlassPane02_19rd142 f = new MyGlassPane02_19rd142("MyGlassPane01");
		f.setVisible( true );
	}
}

