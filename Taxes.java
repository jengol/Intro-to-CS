public class Taxes{
	public static void main(String[] args){
		System.out.println("Enter income (in Ebolian dollars).");
		int income = IO.readInt();
		double tax;
		if (income <= 0){
			IO.reportBadInput();
			System.exit(0);
		}
		if (income >= 82000)
			tax = (income - 82000) * .35 + 15900;
		else if (income >= 34000)
			tax = (income - 34000) * .25 + 4700;
		else if (income >= 8000)
			tax = (income - 8000) * .15 + 800;
		else tax = income * .10;
		IO.outputDoubleAnswer(tax);
	}
}
			