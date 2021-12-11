class Lec02Kadai{
	public static void main(String [] args){

		int [][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] B = {{1,1,0},{2,0,1},{0,2,3}};
		int result;

		System.out.println("s—ñ‚`");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("s—ñ‚a");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
	
		System.out.println("s—ñ‚`+s—ñ‚a");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				result = A[i][j]+B[i][j];
				System.out.print(+result);
				System.out.print("\t");
			}
			System.out.println();
		}

		result=0;

		System.out.println("s—ñ‚`~s—ñ‚a");
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					result+=A[i][k]*B[k][j];
				}
				System.out.print(+result);
				System.out.print("\t");
				result=0;
			}
			System.out.println();
		}

		result=0;

		System.out.println("s—ñ‚a~s—ñ‚`");
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					result+=B[i][k]*A[k][j];
				}
				System.out.print(+result);
				System.out.print("\t");
				result=0;
			}
			System.out.println();
		}
	}
}