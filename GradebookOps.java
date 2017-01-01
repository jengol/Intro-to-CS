public class GradebookOps{
	
	public static int findStudent(String studentName, String[] allStudentNames, boolean alphabetical){
		
		for(int i=0;i<allStudentNames.length; i++){
			if (allStudentNames[i].equals(studentName))
				return i;
		}
		
		return -1;
	}

	public static double computeGrade(int studentIndex, int[][] scoreTable, int[] itemPointValues){
		double sum = 0;
		double sumPV = 0;
		double total;
		for (int j=0; j<scoreTable[0].length; j++){
			if (scoreTable[studentIndex-1][j]!= -1){
				sum += scoreTable[studentIndex-1][j];
			} 
		}
		for (int i=0; i<itemPointValues.length; i++){
			sumPV += itemPointValues[i];
		}
		total = sum/sumPV*100;
		return total;
	}
	
	public static double[] computeAllGrades(int[][] scoreTable, int[] itemPointValues){
		
		double sum2 = 0;
		
		for (int x=0; x<itemPointValues.length; x++){
			sum2 += itemPointValues[x];
		}
		
		
		double[] allGrades = new double[scoreTable.length];
		double sum1 = 0;
		
		for (int k=0; k<scoreTable.length;k++){
			for (int l=0; l<scoreTable[0].length;l++){
				sum1 += scoreTable[k][l];
			} 
			allGrades[k] = sum1/sum2*100;
			sum1 = 0;
		}
		return allGrades;
	}

	public static double computeClassAverage(int item, int[][] scoreTable){
		
		double classAvg;
		double sum3 = 0;
		for (int w = 0; w<scoreTable.length; w++){
			if (scoreTable[w][item-1] != -1){
				sum3 += scoreTable[w][item-1];
			} 
		}
		classAvg = sum3/length;
		return classAvg;
	}
}
	