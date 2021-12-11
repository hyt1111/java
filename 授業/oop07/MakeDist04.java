import java.io.*;

//����MakeDist.java�����s����ƁC�����I�Ɋm�����x���z�����������D

public class MakeDist04 {

//<�g����>
//
//�@�@�Z��(1,1) ����c�ɂP�񕪂̃f�[�^����ׂ�csv�`���̓��̓t�@�C����p�ӂ���D
//

//�A ���o�̓t�@�C���̂���t�H���_����ݒ肷��D
//��������ɂ���ƃJ�����g�f�B���N�g�����Q�Ƃ���D
//"C:\\myprogramJ\\���z�ƃq�X�g�O�����̍쐬\\";
public static final String folderName = "";;


//�B�@�ȉ��̃p�����[�^��K�؂ɐݒ肷��D

public static final double xmax =  5;		//x���̒l�̔z��̍ő�l
public static final double xmin = -5;		//x���̒l�̔z��̍ŏ��l
public static final double dx   = 0.1;		//x���̒l�̔z��C��Ԕz��(y[])�̍���

public static final int    Nmax = 500;		//x���̒l(���x��)�̔z��(x[])�̍ő吔
						//�z��T�C�Y���`���邽�߂̒萔
						//
						// Nmax �� (���f�[�^�̃T�C�Y)/100 �ȉ����x
						//
						//��Ԕz��̌�(N �� Nmax)
						//int N = (int)((xmax -xmin)/dx + 1);\
						//��N����`�����̂ŁCNmax�� N �� Nmax �ƂȂ�悤��߂�D


//�C�@�R�}���h�v�����v�g����MakeDist.java���R���p�C�����Ď��s����D
//
//�D�@�ȉ��̂悤��Excel��Frequency�֐��ɏ������`���ŁC
//    �f�[�^�̃q�X�g�O�������瓾����m�����x���z���o�͂����D
//    �܂��C�f�[�^�̕��ρC���U���瓾���鐳�K���zpdf��f(x)�Ƃ��ďo�͂����D
/*-----------------------
�z��y�̌��FN+1
�z��x�̌��FN

y[i] < y[i-1]
Count[i-1] (y[i] < data �� y[i-1]�Ȃ�data�̐�)

-------------------------
y[0]
	x[0]	Count[0]	Dist[0]
y[1]
�c
y[i-1]
	x[i-1]	Count[i-1]	Dist[i-1]
y[i]
�c
y[N-1]
	x[N-1]	Count[N-1]	Dist[N-1]
y[N]

(N �� Nmax)
------------------------
*/


	public static void main(String[] args) {
		try {
			//�f�[�^����o�͂���csv�t�@�C������W�����͂�����D
			System.out.println("The current data folder is "+ folderName+". \n");
			System.out.print("Enter an input file name (without .csv): ");
			BufferedReader buffIn = new BufferedReader(new InputStreamReader(System.in));
			String inputFileName = folderName + buffIn.readLine()+".csv";
			System.out.println("Reading the input data file: "+inputFileName);
			System.out.println("...");
			System.out.print("Enter an output file name (without .csv): ");
			BufferedReader buffOut = new BufferedReader(new InputStreamReader(System.in));
			String outputFileName = folderName + buffOut.readLine()+".csv";
			System.out.println("Producing the output data file: "+outputFileName);
			System.out.println("...");
			
			
			//��Ԕz��̌�(N �� Nmax)
			int N = (int)((xmax -xmin)/dx + 1);

			if(N<=Nmax){

				//�t�@�C�����̐ݒ�i<�g����>�A�j
				File       InputCSV  = new File(inputFileName); 
				FileWriter OutputCSV = new FileWriter(outputFileName);
				
				//�ϐ��̒�`
				double[] y = new double[Nmax+1];
				double[] x = new double[Nmax];
				int[] Count = new int[Nmax];
				double[] Dist = new double[Nmax];
				double[] f = new double[Nmax];
				double data;
				int dataSize = 0;	//���z�ɃJ�E���g�����f�[�^��
				int rawDataSize = 0;	//���Ƃ̃f�[�^��
				double ymax = xmax + 0.5 * dx;
				double ymin = xmin - 0.5 * dx;
				double dataMax, dataMin;

				double aveData = 0;	//�f�[�^�̕��ϒl
				double varData = 0;	//�f�[�^�̕��U
				double SDData = 0;	//�f�[�^�̕W���΍�
				double sumData = 0;	//�f�[�^�̘a
				double sumSqData = 0;	//�f�[�^�̓��a


				String line;

				//���̓t�@�C���̓ǂݍ���
				BufferedReader br = new BufferedReader(new FileReader(InputCSV));

				for(int i = 0; i< N; i++){
					x[i] = xmax - i * dx;
					y[i] = ymax - i * dx;
					Count[i] = 0;
				}
				y[N] = ymax - N * dx;
				Count[N] = 0;

				//�ЂƂ߂̃f�[�^�̓ǂݍ��݂Ə����l�ݒ�
				//�ő�l�E�ŏ��l�Ȃǂ����߂邽�߁C
				//�ЂƂ߂̃f�[�^����while���̊O�œǂݍ��݁C������Ԃ����
				line = br.readLine();
				data = Double.parseDouble(line);//����(String�^)��double�^�ɕϊ����郁�\�b�h
				dataMax = data;
				dataMin = data;
				sumData = data;
				sumSqData = Math.pow(data,2);
				rawDataSize++;
				if(ymin < data && data <= ymax){
					int i = (int)((ymax - data)/dx);
					Count[i]++;
					dataSize++;
				}

				//�Q�ڈȍ~�̃f�[�^�̓ǂݍ���
				while ((line = br.readLine()) != null) {

					data = Double.parseDouble(line);
					rawDataSize++;
					if(dataMax < data){
						dataMax = data;
					}
					if(data < dataMin){
						dataMin = data;
					}
					sumData = sumData + data;
					sumSqData = sumSqData + Math.pow(data,2);			

					if(ymin < data && data <= ymax){
						int i = (int)((ymax - data)/dx);
						Count[i]++;
						dataSize++;
					}
	      		}
				br.close();

				aveData = sumData / rawDataSize;
                		varData = (sumSqData - 2 * aveData * sumData + rawDataSize * Math.pow(aveData, 2)) / (rawDataSize - 1);
				SDData = Math.sqrt(varData);

				for(int i = 0; i< N; i++){
					Dist[i] = Count[i]/(dx * dataSize);
					
					//Gaussian
					f[i] = Math.exp(-Math.pow((x[i]-aveData),2)/(2*varData))/Math.sqrt(2*Math.PI*varData);
				}

				//�����o��
				PrintWriter pw = new PrintWriter(new BufferedWriter(OutputCSV));

				pw.write("The number of the original data: " + rawDataSize + "\r\n");
				pw.write("The max. value: " + dataMax + "\r\n");
				pw.write("The min. value: " + dataMin + "\r\n");
				pw.write("The average E(x): " + aveData + "\r\n");
				pw.write("The variance V(x): " + varData + "\r\n");
				pw.write("The standard deviation ��V(x): " + SDData + "\r\n");
				pw.write("\r\n");
				pw.write("[The probability density distribution] \r\n");
				pw.write("The number of data for the distribution: " + dataSize + "\r\n");
				pw.write("The interval of y: " + ymin +" < y �� "+ ymax + "\r\n");
				pw.write("The interval of x: " + xmin +" �� x �� "+ xmax + "\r\n");
				pw.write("The delta of x: " + dx + "\r\n");
				pw.write("x , Dist(x), f(x): \r\n");
				for(int i = 0; i< N; i++){
					pw.write(x[i] + "," + Dist[i] + ","+ f[i] + "\r\n");
				}

				pw.close();
				
				System.out.println("The number of the original data: " + rawDataSize );				
				System.out.println("The number of data for the distribution: " + dataSize );

			}
			else{
				System.out.println("Error! Nmax is too small!");
				System.out.println("Nmax must be greater than or equal to" + N + ".");

			}

		}catch (FileNotFoundException e) {
			// File�I�u�W�F�N�g�������̗�O�ߑ�
			e.printStackTrace();
			/*
			printStackTrace()
			��O��������ꂽ���R���擾�ł���D
			������n�����ɌĂяo���ƕW���G���[�o�͂ɏo�͂����D 
			������PrintWriter�N���X��n���ƁC�n���������o�̓X�g���[����ʂ��ďo�͂���邽�߁C
			�������t�@�C�����C�D���ȏo�͐��I�����邱�Ƃ��ł���D
			*/

		}catch (IOException e) {
			// BufferedReader�I�u�W�F�N�g�̃N���[�Y���̗�O�ߑ�
			e.printStackTrace();
		}
	}
}

