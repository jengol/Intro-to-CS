public class MatrixOps{
	public static double[][] multiply(double[][] A, double[][] B){
		
		double[][] product = new double[A.length][B[0].length];
		int sum = 0;
		for (int row = 0; row < A.length; row++){
			for (int col = 0; col < B[0].length; col++){
				for (int k = 0; k < B.length; k++){
					sum += A[row][k]*B[k][col];
				}	
				product[row][col] = sum;
				sum = 0;
			}
		}
			
		return product;
	}
}