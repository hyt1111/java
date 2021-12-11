import java.io.*;
import java.util.*;
import java.util.Scanner;
/*
�J��Ԃ��f�[�^���t�@�C���o�͂��܂��D
outputFileName��csv�t�@�C���������C
���������f�[�^��csv�`���ŕۑ����܂��D
*/

public class CalculatedDataOutput02_19rd142 {
	//Iteration�񐔁FImax
	public static final int Imax = 10000;	

	public static void main(String[] args) {
		try {
			//�A�f�i�V���v���j�f�[�^��ۑ�����csv�t�@�C���������
			System.out.print("Please decide the csv file name that you want to make (without .csv): ");
			Scanner scan = new Scanner(System.in);
        		String str = scan.nextLine()+".csv";
			String outputFileName =str;
			//�BBufferedWriter�N���X�̃C���X�^���X�𐶐���
			//�Q�ƌ^�ϐ� pw �ɑ������D
			//�ǂݍ��ރt�@�C���� FileWriter() �ŏ���������D
			PrintWriter pw = 
			new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)));

			double y;
			Random rnd = new Random();
			
			//Imax�̃f�[�^�𐶐�����
			for (int i=1; i<= Imax; i++) {

				//���K����Norm(0,1)�𐶐����郁�\�b�h
				y = 0.7*(rnd.nextGaussian())+1;

				//�C�f�[�^�̏o�͂̎d����I��
				pw.write(y + "\r\n");				//[�f�[�^�̂�]�@1�s
				//pw.write(i + "," + y + "\r\n");	//[�f�[�^�ԍ�, �f�[�^]�@2�s
        	}
			pw.close();//�t�@�C�������
			
		}catch (FileNotFoundException e) {
			// File�I�u�W�F�N�g�������̗�O�ߑ�
			e.printStackTrace();
		}catch (IOException e) {
			// BufferedReader�I�u�W�F�N�g�̃N���[�Y���̗�O�ߑ�
			e.printStackTrace();
		}
	}
}
