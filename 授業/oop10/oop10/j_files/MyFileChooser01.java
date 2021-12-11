import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

class MyFileChooser01 extends MyMenuFrame02 implements ActionListener{

	private JFileChooser fc = null; // �t�@�C���`���[�U
	private JMenuItem openItem;
	JLabel label1;
	JLabel label2;

	MyFileChooser01(String title){
		super(title);

		openItem = new JMenuItem("Open...");
		openItem.addActionListener( this );
		menu.insert( openItem, 0 );    // �u�J���v���j���[���ŏ��ɔz�u
		menu.insertSeparator( 1 ); // ���ɃZ�p���[�^��z�u
	}

	public void actionPerformed( ActionEvent e ){
		String name = e.getActionCommand();
		if( name.equals( "Open..." ) ){
			fc = new JFileChooser( "." ); // �J�����g�f�B���N�g���Ńt�@�C���`���[�U����
			fc.setDialogTitle( "Open an image file. " ); // �_�C�A���O�̃^�C�g���ݒ�
			int ret = fc.showOpenDialog( this ); // �t�@�C���`���[�U�N��
			
			if( ret == JFileChooser.APPROVE_OPTION ){ // �t�@�C�����I�����ꂽ�Ȃ�
				File file = fc.getSelectedFile(); // ���̃t�@�C�������o����
				String fname = file.getAbsolutePath(); // ������(�t�@�C����)�ɕϊ�����
				System.out.println( "Selected file name: " + fname ); // �����\��
				
				label1 = new JLabel( new ImageIcon( fname ) );
				label2 = new JLabel( fname );

				add( label1, BorderLayout.CENTER ); // �����Ɏʐ^��z�u
				add( label2, BorderLayout.NORTH  ); // �e�L�X�g����ɔz�u
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

