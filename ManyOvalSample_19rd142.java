import java.awt.*; 
import javax.swing.*;
public class ManyOvalSample_19rd142 extends JPanel{
// �`�悷��Ƃ��̏��� // paintComponent ���\�b�h�̃I�[�o�[���C�h

	public void paintComponent(Graphics g){
 //javax.swing.JComponent �N���X�̃��\�b�h 
		super.paintComponent(g);
			int [] A=new int [3];
				for(int i=0;i<30;i++){
					for(int j=0;j<3;j++){
						A[j]=(int)(Math.random()*255);
					}
					g.setColor(new Color(A[0],A[1],A[2],70));
					g.fillOval(A[0],A[1],A[2],A[2]);
				}
	}

	public static void main(String[] args){
	// �t���[���𐶐�����
		JFrame fr = new JFrame(); // �p�l���𐶐����� JPanel panel = new JPanel();
		ManyOvalSample_19rd142 panel = new ManyOvalSample_19rd142();
		//�p�l���T�C�Y�����߂邽��
		panel.setPreferredSize(new Dimension(500, 400));
		//Dimension dim = new Dimension(500, 400); //panel.setPreferredSize(dim);
		panel.setBackground(Color.white);

		// �t���[����ݒ肷��
		fr.add(panel);//�p�l�����t���[���ɂ͂ߍ��� 
		fr.pack(); //�p�l�� panel �̑傫���ɍ��킹�ăt���[�� fr �̑傫�������߂�
		fr.setTitle("�~�̕`��");//�^�C�g���̕\�� //�~�{�^���Ńv���O�������I�������� 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(true);//�t���[���T�C�Y���� (true) �^�s�� (false) �ɂ��� 
		fr.setVisible(true);//�t���[������ʂɕ\��������
	}
}
