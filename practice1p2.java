public class practice1p2{
	public static void main(String[] args){
		System.out.println("Enter your base monthy fee.");
		double fee = IO.readDouble();
		System.out.println("Enter your minutes for the month.");
		int minutes = IO.readInt();
		System.out.println("What is your maximum number of minutes before additional charges?");
		int over = IO.readInt();
		System.out.println("What is the rate for overusage?");
		double rate = IO.readDouble();
		double total;
		if (minutes > over){
			total = (minutes - over) * rate + fee;
		} else total = fee;
		System.out.println("Your total bill is $" + total);
	}
}
			
		