import java.io.*;
//Scaner �N���X���܂� 
public class Kadai02_19rd142 { 
	public static void main(String[] args) { 
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Prease input some strings: "); 
			String str = br.readLine(); 
			str=str.replaceAll("a","x");
			str=str.replaceAll("[b-z]","o");
			str=str.replaceAll("[A-Z]","o");
			str=str.replaceAll("[0-9]","o");
			System.out.println("Your input strings are : "+str);
			//System.out.println("Your input strings are : "+str); 
		}catch (IOException e) {
			// BufferedReader�I�u�W�F�N�g�̃N���[�Y���̗�O�ߑ�
			e.printStackTrace();
		}finally{ 
			//�ǂ�ȗ�O���o�Ă��C�����͎��s����� 
			System.out.println("It was done(1)"); 
		} 
			//�z��O�̗�O���o��Ƃ����͎��s����Ȃ� 
			System.out.println("It was done(2)");
	} 
}