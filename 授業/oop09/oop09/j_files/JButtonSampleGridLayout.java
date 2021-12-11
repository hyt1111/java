import javax.swing.*;//JFrame �N���X���܂�
import java.awt.event.*;//ActionListener �C���^�[�t�F�[�X���܂�
import java.awt.*;//Container �N���X�CGridLayout �N���X���܂�

class JButtonSampleGridLayout extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was pushed!");
	}

	JButtonSampleGridLayout(){
		setSize(500, 400);
		setTitle("Frame title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���C�A�E�g�}�l�[�W���[�ɂ��R���|�[�l���g�̔z�u
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(3,2) );
		
		JButton btn1 = new JButton("Button-1");
		btn1.addActionListener(this);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Button-2");
		btn2.addActionListener(this);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("Button-3");
		btn3.addActionListener(this);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("Button-4");
		btn4.addActionListener(this);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("Button-5");
		btn5.addActionListener(this);
		contentPane.add(btn5);
	}
	
	public static void main(String [] args){
		//JFrame �N���X�̃C���X�^���X�𐶐�
		JButtonSampleGridLayout fr = new JButtonSampleGridLayout();
		//�t���[�����f�B�X�v���C��ʂɕ\�����܂�
		fr.setVisible(true);
	}
}
