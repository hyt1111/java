import javax.swing.*;//JFrame �N���X���܂�
import java.awt.event.*;//ActionListener �C���^�[�t�F�[�X���܂�
import java.awt.*;//Container �N���X�CBorderLayout �N���X���܂�

class JButtonSampleBorderLayout extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was pushed!");
	}

	JButtonSampleBorderLayout(){
		setSize(500, 400);
		setTitle("Frame title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���C�A�E�g�}�l�[�W���[�ɂ��R���|�[�l���g�̔z�u
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout() );
		
		//�{�^���̐���
		JButton btn1 = new JButton("Button-NORTH");
		btn1.addActionListener(this);
		contentPane.add(btn1,BorderLayout.NORTH);
		
		JButton btn2 = new JButton("Button-EAST");
		btn2.addActionListener(this);
		contentPane.add(btn2,BorderLayout.EAST);
		
		JButton btn3 = new JButton("Button-WEST");
		btn3.addActionListener(this);
		contentPane.add(btn3,BorderLayout.WEST);
		
		JButton btn4 = new JButton("Button-SOUTH");
		btn4.addActionListener(this);
		contentPane.add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("Button-CENTER");
		btn5.addActionListener(this);
		contentPane.add(btn5,BorderLayout.CENTER);
	}

	public static void main(String [] args){
		//JFrame �N���X�̃C���X�^���X�𐶐�
		JButtonSampleBorderLayout fr = new JButtonSampleBorderLayout();
		//�t���[�����f�B�X�v���C��ʂɕ\�����܂�
		fr.setVisible(true);
	}
}
