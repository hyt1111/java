import javax.swing.*;

class JFrameSample01{
	public static void main(String [] args){
		//JFrame �N���X�̃C���X�^���X�𐶐�
		JFrame fr = new JFrame();
		//�t���[���T�C�Y�̎w��i���C�c�j[�s�N�Z��]
		fr.setSize(500, 400);
		//�t���[���^�C�g���̕\��
		fr.setTitle("Frame title");
		//�~�{�^���������ƃv���O�������I�����܂�
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�t���[�����f�B�X�v���C��ʂɕ\�����܂�
		fr.setVisible(true);
	}
}
