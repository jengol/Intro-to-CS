public class CellSimTrial{
	public static void main(String[] args){
		double countB = 0;
		double countX = 0;
		double total = 0;
		char[][] tissue = new char[10][10];
		for (int row=0;row<10;row++){
			for (int col=0;col<10;col++){
				double b = Math.random();
				if (b > .66){
					tissue[row][col] = 'X';
					countX++;
					total++;
				} else if (b>.33){
					tissue[row][col] = 'O';
					total++;
				} else {
					tissue[row][col] = ' ';
					countB++;
					total++;
				
			}
			}
		}
		for (int row=0;row<10;row++){			
			for (int col=0;col<10;col++){		
				System.out.print(tissue[row][col]);
			}
			System.out.println();
		}
		int percentBlank = (int)Math.ceil((countB/total)*100);
		System.out.println("PercentBlank is: " + percentBlank);
		int percentX = (int)Math.ceil((countX/(total-countB))*100);
		System.out.println("PercentX is : " + percentX);
		}
}

		