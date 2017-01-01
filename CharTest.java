class CharTest {

	public static void main(String[] args) {

		System.out.println("Enter a character:");

		char c = IO.readChar();

		if (Character.isLetter(c)) {
			System.out.println("That is a letter.");
		}

		else if (Character.isDigit(c)) {
			System.out.println("That is a digit.");
		} else {
			System.out.println("That is neither.");

		}

	}

}