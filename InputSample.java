import java.io.*;//InputStreamReader �N���X���܂܂��
//���̃N���X�̓R���p�C���G���[���������܂� 
public class InputSample { 
	public static void main(String[] args){ 
		try{
			//�o�C�g�X�g���[���𕶎��X�g���[���ɕϊ����邽�� 
			InputStreamReader isr = new InputStreamReader(System.in); System.out.print("Prease input a charactor: ");
			//�W�����͂���o�C�g�f�[�^��ǂݍ��ݒP��̕�����Ԃ� 
			int c = isr.read(); System.out.println("Your input charactor is : "+(char)c);
		}catch (IOException e){ 
			System.out.println("IOException!!"); }

		}finally{ 
			//�ǂ�ȗ�O���o�Ă��C�����͎��s����� 
			System.out.println("It was done(1)"); 
		} 
			//�z��O�̗�O���o��Ƃ����͎��s����Ȃ� 
			System.out.println("It was done(2)");
	}
}
