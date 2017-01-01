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
    	    
if (row == 0 && col < tissue[0].length-1){	//side
	
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

if (col == tissue[0].length-1 && row < tissue.length-1){	//side
	
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
	
if (col == tissue[0].length-1 && row = tissue.length-1){		// corner
	
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

if (row == tissue.length-1 && col < tissue[0].length-1){		//side
	
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

if (row == tissue.length-1 && col =0 0){		//corner
	
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

if (row < tissue.length-1 && col == 0){			//side 
	
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