public class primeTime{
	public static void main(String[] args){
		long startTime;
		long endTime;
		double time;
		startTime = System.currentTimeMillis();
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
		endTime = System.currentTimeMillis();
		time = (endTime - startTime) / 1000;
		System.out.println("\nTime to calculate is: " + time + "milliseconds");
	}
}