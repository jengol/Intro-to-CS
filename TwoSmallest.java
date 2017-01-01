public class TwoSmallest{
	public static void main(String[] args){
		System.out.println("Enter a sentinel number to start the program.");
		System.out.println("Enter the same sentinel later to end the program.");
		double term = IO.readDouble();	
		System.out.println("Enter first number.");
		double number = IO.readDouble();
		double smallest = number;
		System.out.println("Enter next number");
		double number2 = IO.readDouble();
		double small = number2;
		System.out.println("Enter next number");
		double num1 = IO.readDouble();
		while ( num1 != term){
			if (small >= num1){				
				if (smallest >= num1){
					small = smallest;
					smallest = num1;		
				} else small = num1;
			}
			if (smallest >= num1){
				if (small>= num1){
					smallest = small;
					small = num1;
				} else smallest = num1;
			} System.out.println("Enter next number");
			num1 = IO.readDouble();
			
		} 
		if (smallest > small){
			double k;
			k = smallest;
			smallest = small;
			small = k;
		}
		IO.outputDoubleAnswer(smallest);
		IO.outputDoubleAnswer(small);
	}
}