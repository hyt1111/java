import javax.swing.*;
class JFrameSample01b extends JFrame{
	JFrameSample01b(){
		//�� this. �͏ȗ����邱�Ƃ��ł��܂��D
		//�t���[���T�C�Y�̎w��i���C�c�j[�s�N�Z��]
		this.setSize(500, 400);
		//�t���[���^�C�g���̕\��
		this.setTitle("Frame title");
		//�~�{�^���������ƃv���O�������I�����܂�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String [] args){
		//JFrame �N���X�̃C���X�^���X�𐶐�
		JFrameSample01b fr = new JFrameSample01b();
		//�t���[�����f�B�X�v���C��ʂɕ\��
		fr.setVisible(true);
	}
}
