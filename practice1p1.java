public class practice1p1{
	public static void main(String[] args){
		System.out.println("What is the total sales charge?");
		double charge = IO.readDouble();
		System.out.println("How much is the customer giving?");
		double payment = IO.readDouble();
		double change = payment - charge;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		while (change >= 20){
			change -= 20;
			twenties ++;
		} while (change >= 10){
			change -= 10;
			tens ++;
		} while (change >= 5){
			change -= 5;
			fives++;
		} while (change >= 1){
			change -= 1;
			ones++;
		} while (change >= .25){
			change -= .25;
			quarters++;
		} while (change >= .10){
			change -= .10;
			dimes++;
		} while (change >= .01){
			change -= .01;
			pennies++;
		} 
		if (twenties > 0)
			System.out.println(twenties + " $20 bills");
		if (tens > 0)
			System.out.println(tens + " $10 bills");
		if (fives > 0)
			System.out.println(fives + " $5 bills");
		if (ones > 0)
			System.out.println(ones + " $1 bills");
		if (quarters > 0)
			System.out.println(quarters + " quarters");
		if (dimes > 0)
			System.out.println(dimes + " dimes");
		if (nickels > 0)
			System.out.println(nickels + " nickels");
		if (pennies > 0)
			System.out.println(pennies + " pennies");
	}
}
			