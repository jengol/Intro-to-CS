public class CellSim{


	public static void main(String[] args){
		
		
		System.out.println("What size grid (nxn)?");
		int n = IO.readInt();
		
		char[][] tissue = new char[n][n];
		
		System.out.println("What is the threshold? (how many like-agents that must surround the agent to be satisfied)");
		int threshold = IO.readInt();
		System.out.println("How many rounds should this simulation run through?");
		int maxRounds = IO.readInt();
		System.out.println("What is the frequency that the grid should be printed?");
		int frequency = IO.readInt();
		System.out.println("What percentage of X agents should there be?");
		int percentX = IO.readInt();
		System.out.println("What percentage of blank agents should there be?");
		int percentBlank = IO.readInt();
		
		assignCellTypes(tissue,percentBlank,percentX);
		
		
		int total=0;
		for (int i=1; i<=maxRounds; i++){
			total += moveAllUnsatisfied(tissue,threshold);
			if (i%frequency == 0){
				printTissue(tissue);
			}
		}
		
		
		System.out.println("Initial board:");
		printTissue(tissue);
		System.out.println("Final Board");
		printTissue(tissue);
		System.out.println("Is the board satisfied?");
		boolean TS = boardSatisfied(tissue,threshold);
		if (TS){
			System.out.println("Yes, the board is satisfied");
		}else {
			System.out.println("No, the board is not satisfied");
			int count = 0;
			for (int s = 0; s<tissue.length; s++){
				for (int t = 0; t< tissue[0].length; t++){
					if (isSatisfied(tissue,s,t,threshold)){
							count++;
					}
				}
			}
			double percentSatisfied = (double)(count)/(tissue.length*tissue[0].length);
			System.out.print("The percentage of satisfied agents is: ");
			System.out.println(percentSatisfied);
		}
		
		System.out.print("The total number of movements that occurred in the simulation is: ");
		System.out.println(total);
		
	}
	
	public static void printTissue(char[][] tissue){
		
		for (int row=0;row<10;row++){				// used a nested for for loop to print
			for (int col=0;col<10;col++){			// the array
				System.out.print(tissue[row][col]);
			}
			System.out.println();
		}
		
	}
	
	public static void assignCellTypes(char[][] tissue, int percentBlank, int percentX){

		
		double pX = Math.ceil(percentX*(100-percentBlank)/100);
		double pO = (100-percentBlank)-pX;
		double countO = 0;
		double countX = 0;
		double countB = 0;
		for (int row=0;row<10;row++){
			for (int col=0;col<10;col++){
				
				double a = Math.random();				
				double b = 1;		
				
				if ((countX >= pX) && (countO >= pO)){			//This complicated algorithm is used to randomly
					tissue[row][col] = ' ';				//assign each cell with a character 'X','O', or ' '. 
				} else if (countB >= percentBlank && countO >= pO){	
					tissue[row][col] = 'X';
				} else if (countX >= pX && countB > percentBlank){
					tissue[row][col] = 'O';
				}else if (countX >= pX){
					if (a > .5){
						tissue[row][col] = 'O';
						countO++;
					} else {
						tissue[row][col] = ' ';
						countB++;
					}
				} else if (countB >= percentBlank){
					if (a > .5){
						tissue[row][col] = 'O';
						countO++;
					} else {
						tissue[row][col] = 'X';
						countX++;
					}
				}else if (countO >= pO){
					if (a > .5){
						tissue[row][col] = 'X';
						countX++;
					} else{
						tissue[row][col] = ' ';
						countB++;
					} 
				} else if ((a > b*2/3) && (countX < pX)){		
					tissue[row][col] = 'X';
					countX++;
				} else if ((a>b*1/3) && (countO < pO)){
					tissue[row][col] = 'O';
					countO++;
				} else if (countB < percentBlank){
					tissue[row][col] = ' ';
					countB++;	
				} 
		}
	}
}

	    public static boolean isSatisfied(char[][] tissue, int row, int col, int threshold){
		    boolean isSatisfied = false;
		    int count = 0;
		    int countQ = 0;
		    int countB = 0;
		    
		    
		    if (tissue[row][col] == ' '){	// blank cells are satisfied
			    isSatisfied = true;
			    return isSatisfied;
		    }
		    
		    // 8 if/else loops to determine if surrounding points are the same 
		    // as the point at tissue[row][col] keeping a running count of them
		    
		    if (row > 0  && col > 0 && row < tissue.length-1 && col < tissue[0].length-1){   	    
			    if (tissue[row-1][col-1] == tissue[row][col]){ 		//1
				    count++;
			    } else if (tissue[row-1][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
		    
		    
			    if (tissue[row-1][col] == tissue[row][col]){		//2
				    count++;
			    } else if (tissue[row-1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
		    
		    
			     if (tissue[row-1][col+1] == tissue[row][col]){		//3
				    count++;
			    } else if (tissue[row-1][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    
			     if (tissue[row][col-1] == tissue[row][col]){		//4
				    count++;
			    } else if (tissue[row][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    
			     if (tissue[row][col+1] == tissue[row][col]){		//5
				    count++;
			    } else if (tissue[row][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    
			     if (tissue[row+1][col-1] == tissue[row][col]){		//6
				    count++;
			    } else if (tissue[row+1][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    
			     if (tissue[row+1][col] == tissue[row][col]){		//7
				    count++;
			    } else if (tissue[row+1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    
			     if (tissue[row+1][col+1] == tissue[row][col]){		//8
				    count++;
			    } else if (tissue[row+1][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			}
			
		// To account for the corners and sides, another 8 nested loops are used
		
		 if (row == 0 && col == 0){		//corner
			
			if (tissue[row][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    if (tissue[row+1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row+1][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			}
			    
		if (row == 0 && col < tissue[0].length-1 && col != 0){	//side
			
			     if (tissue[row][col-1] == tissue[row][col]){	//FIX THIS	
				    count++;
			    } else if (tissue[row][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row+1][col-1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row+1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row+1][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			}
			
		if (row == 0 && col == tissue[0].length-1){		//corner
			
			     if (tissue[row][col-1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row+1][col-1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row+1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			}
		
		if (col == tissue[0].length-1 && row < tissue.length-1 && row != 0){	//side
			
			    if (tissue[row-1][col-1] == tissue[row][col]){ 		
				    count++;
			    } else if (tissue[row-1][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row-1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row-1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			
			     if (tissue[row][col-1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row+1][col-1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row+1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			}
			
		if (col == tissue[0].length-1 && row == tissue.length-1){		// corner
			
			   if (tissue[row-1][col-1] == tissue[row][col]){ 		
				    count++;
			    } else if (tissue[row-1][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row-1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row-1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			
			     if (tissue[row][col-1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			}
		
		if (row == tissue.length-1 && col < tissue[0].length-1 && col != 0){		//side
			
			 if (tissue[row-1][col-1] == tissue[row][col]){ 		
				    count++;
			    } else if (tissue[row-1][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row-1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row-1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row-1][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row-1][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row][col-1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col-1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			     if (tissue[row][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			}
		
		if (row == tissue.length-1 && col == 0){		//corner
			
			   if (tissue[row-1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row-1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    
			     if (tissue[row-1][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row-1][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			      if (tissue[row][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			
			}
		
		if (row < tissue.length-1 && col == 0 && row != 0){			//side 
			
			      if (tissue[row-1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row-1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    
			     if (tissue[row-1][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row-1][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			      if (tissue[row][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    if (tissue[row+1][col] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			    
			    
			     if (tissue[row+1][col+1] == tissue[row][col]){		
				    count++;
			    } else if (tissue[row+1][col+1] == ' '){
				    countB++;
			    } else {
				    countQ++;
			    }
			}
			    
			    
			    double percentType = ( ((double) count)/(count+countQ))*100;
			    
			    if (percentType > threshold){
				    isSatisfied = true;
			    }
			    return isSatisfied;
		    
		    }
	   
	    public static boolean boardSatisfied(char[][] tissue, int threshold){
		    
		    boolean boardSatisfied = true;
		    
		    for (int i=0; i<tissue.length; i++){
			    for (int j=0; i<tissue[0].length; j++){
    	    	    	    if (isSatisfied(tissue,i,j,threshold) == false){
    	    	    	    	    boardSatisfied = false;
				    }
			    }
		    }
		    return boardSatisfied;
		    }
    
	    public static int moveAllUnsatisfied(char[][] tissue, int threshold){
	    
	    
	    int count = 0;
	    if (boardSatisfied(tissue,threshold)){
			    return count;
	    }
	    
	    for (int i=0; i<tissue.length; i++){
		    for (int j=0; j<tissue[0].length; j++){
			    if (isSatisfied(tissue,i,j,threshold)== false){
					    for (int d=0; d< tissue.length; d++){
					    	    for (int f=0; f< tissue[0].length; f++){
					    	    	    if (tissue[d][f] == ' '){
					    	    	    	    char temp = tissue[i][j];
					    	    	    	    tissue[i][j] = tissue[d][f];
					    	    	    	    tissue[d][f] = temp;
					    	    	    }
					    	    }
					    }
					    count++;
			    }
			    }
		    }
	    
	    return count;
	    }
}
