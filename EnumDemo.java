public class EnumDemo{
	
	enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	
	enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}
	
	public static void main(String[] args){
		Day tgif;
		Month libra;
		tgif = Day.FRIDAY;
		libra = Month.OCT;
		
		System.out.print("My sign is libra, since I was born in ");
		System.out.println(libra);
		System.out.print("That's the ");
		System.out.println(libra.ordinal() + 1 + "th month of the year.");
		System.out.println("\nIsn't it nice for it to be finally " + tgif + "?");
		System.out.println(tgif + " is the " + tgif.ordinal() + "th day of the week");
	}
}
		