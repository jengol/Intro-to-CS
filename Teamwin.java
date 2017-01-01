public class Teamwin{
	public static void main(String[] args){
		
		System.out.println("Enter top of range: ");
		int rangeLimit = IO.readInt();
		System.out.println("Team B, look away. Team A, enter your number. ");
		int targetA = IO.readInt();
		System.out.println("Team A, look away. Team B, enter your number. ");
		int targetB = IO.readInt();
		System.out.println("Enter maximum number of guess allowed: ");
		int maxGuesses = IO.readInt();
		
		boolean teamAwins = false, teamBwins = false;
		
		for (int guessCount = 0; guessCount < maxGuesses; guessCount++){
			System.out.println("Team A, guess!");
			int guessA = IO.readInt();
			if (guessA == targetB){				
				teamAwins = true;
				break;
			} else if (targetB > guessA){
				System.out.println("Higher");
			} else {
				System.out.println("Lower");
			}
			System.out.println("Team B, guess!");
			int guessB = IO.readInt();
			if (guessB == targetA) {
				teamBwins = true;
				break;
			} else if (targetA > guessB) {
				System.out.println("Higher");
			} else { 
				System.out.println("Lower");
			}
		}		
		if (teamAwins) {
			System.out.println("Team A wins!");
		} else if (teamBwins) {
			System.out.println("Team B wins!");
		} else { 
			System.out.println("It's a draw!");
		}
	}
}
		