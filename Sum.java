public class Sum{
	public static void main(String[] args){
		int num1, num2, sum;
		System.out.println("Enter first integer: ");
		num1 = IO.readInt();
		System.out.println("Enter second integer: ");
		num2 = IO.readInt();
		sum = num1 + num2;
		System.out.print("Sum: ");
		System.out.println(sum);
	}
}