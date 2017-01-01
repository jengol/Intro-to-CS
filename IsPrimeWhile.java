public class IsPrimeWhile{
	public static void main(String[] args){
	int n = IO.readInt();
	boolean divisorFound = false;
	int k = 2;
	while (k < n){
		if (n % k == 0){
			divisorFound = true;
			break;
		}
		k = k + 1;
	}
	if (divisorFound){
		IO.outputStringAnswer("not prime");
	} else {
		IO.outputStringAnswer("prime");
	}
	}
}
