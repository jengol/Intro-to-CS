public class NthPrime{
	public static void main(String[] args){
		System.out.println("Enter a positive integer. The integer corresponds");
		System.out.println("to the nth prime number.");
		int n = IO.readInt();
		if (n <= 0){
			IO.reportBadInput();
			System.exit(0);
		}
		int tnum;
		int count;
		for (tnum = 2, count = 0; count < n; tnum++){
			boolean prime = true;
			for (int k = 2; k < tnum; k++){
				if (tnum%k == 0){
					prime = false;
					break;
				}
			}
			if (prime){
				count++;
			}
		} 
		IO.outputDoubleAnswer(tnum-1);
	}
}