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
		MyGlassPane01 f = new MyGlassPane01("MyGlassPane01");
		f.setVisible( true );
	}
}

