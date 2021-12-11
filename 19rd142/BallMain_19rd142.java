import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import p052.*;

public class BallMain_19rd142 extends JPanel implements ActionListener{

	//�`��p�l���̃T�C�Y
	private int xPanelSize;
	private int yPanelSize;
	//BallPropagator �N���X�̃C���X�^���X
	BallPropagator_19rd142 b1;
	BallPropagator_19rd142 b2;
	
	//�{�[���̐F
	Color c1;
	Color c2;
	
	//�R���X�g���N�^
	BallMain_19rd142(int xPanelSize, int yPanelSize){
		//�`��p�l���̃T�C�Y
		this.xPanelSize = xPanelSize;
		this.yPanelSize = yPanelSize;
		
		
		//BallPropagator �N���X�̃C���X�^���X�̐����i�{�[���̐����j
		//�{�[��b1 �̏�����ԁi�{�[���̔��a�C�ʒu�C���x�C�����x�j
		b1 = new BallPropagator_19rd142(10, 100, 100, 100, -50, 0, 9.8);
		b2 = new BallPropagator_19rd142(10, 10, 10, 100, -50, 0, 9.8);

		c1 = new Color(255, 165, 0);
		c2 = new Color(51, 255, 51);

	}
	
	//�C�x���g�i�^�C�}�[�ɂ��Ăяo���j�����������Ƃ��̏���
	public void actionPerformed(ActionEvent e){
		//�{�[��b1 �̈ʒu�̍X�V
		b1.xUpdate();
		b1.yUpdate();
		//�{�[��b1 �̑��x�̍X�V
		b1.vxUpdate();
		b1.vyUpdate();
		
		//�{�[��b2 �̈ʒu�̍X�V
		b2.xUpdate();
		b2.yUpdate();
		//�{�[��b2 �̑��x�̍X�V
		b2.vxUpdate();
		b2.vyUpdate();
		
		// �ĕ`��
		repaint();
	}
	// �`�悷��Ƃ��̏���
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//�{�[��b1�̐F��ݒ�
		g.setColor(c1);
		//�{�[��b1��`��
		g.fillOval((int)(b1.getZvalue_x() - b1.getZvalue_r()), (int)(b1.getZvalue_y() - b1.getZvalue_r()),
			(int)(2*b1.getZvalue_r()), (int)(2*b1.getZvalue_r()));
		//�{�[��b2�̐F��ݒ�
		g.setColor(c2);
		
		//�{�[��b2��`��
		g.fillOval((int)(b2.getZvalue_x() - b2.getZvalue_r()), (int)(b2.getZvalue_y() - b2.getZvalue_r()),
			(int)(2*b2.getZvalue_r()), (int)(2*b2.getZvalue_r()));
	}
	// ���C���E���\�b�h
	public static void main(String[] args) {
		MyName pc = new MyName();  
        	System.out.println("����ҁF"+pc.name);
		FunctionSet07 fs = new FunctionSet07(3.0,1.0,1.0); 
		double x,y,z;
		x = 18; 
		y = fs.f(x); 
		System.out.println("��Ǝ���"+y+"�i���j");
		z = 60; 
		y = fs.f(x,z); 
		System.out.println("��Ǝ���"+y+"�i���j");
		
		
		//�������ԊԊu
		BallPropagator_19rd142.dt=0.1;
		
		// �t���[���𐶐�����
		JFrame frame = new JFrame();
		
		// �p�l���𐶐�����
		BallMain_19rd142 panel = new BallMain_19rd142(500,400);
		panel.setBackground(Color.white);
		panel.setPreferredSize(
		new Dimension(panel.xPanelSize, panel.yPanelSize));
		
		//�{�[���̓����͈͂����肷��i���E�����j
		BallPropagator_19rd142.xmin = 0;
		BallPropagator_19rd142.xmax = panel.xPanelSize;
		BallPropagator_19rd142.ymin = 0;
		BallPropagator_19rd142.ymax = panel.yPanelSize;
		
		// �t���[����ݒ肷��
		frame.add(panel);
		frame.pack();
		frame.setTitle("���˂���{�[��");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		
		// �C�x���g�����I�ɔ��������邽�߂̃^�C�}�[
		Timer timer = new Timer(10, panel);
		timer.start();
		
		System.out.println("�{�[����������܂ŉɂȂ̂ŃN�C�Y�����܂��傤�I�I�I");
		Question[] questions = new Question[] {
			new SimpleQuestion("��񂲂�\���p�P���", "apple"),
			new SimpleQuestion("�݂����\���p�P���", "orange"),
			new YesNoQuestion("woman�̕����`�� women", true),
			new YesNoQuestion("forget�̉ߋ��`�� forgetted", false)
		};
		int score = 0;
	
		for(int i = 0; i < questions.length; i ++) {
				Question question = questions[i];
				System.out.println("�� " + (i + 1) + "��:");
				String input = null;
			do {
				input = MySystem.in.getString(question.getQuestion());
				input = input.trim();
			} while(! question.check(input));
				
			boolean isCorrect = question.isCorrect(input);
			if(isCorrect) {
				System.out.println("����!");
				score ++;
			} else {
				System.out.println("�s�����B������ " + question.getAnswer() + "�ł����B");
			}
		}
		System.out.println(questions.length + "�⒆ " + score + "�␳���ł����B");
	}
}