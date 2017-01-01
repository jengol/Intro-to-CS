public class testLetter{
	public static void main(String[] args){
		System.out.println("Test if a character is a letter or not in this program.");
		char c = IO.readChar();
		if (Character.isLetter(c))
			System.out.println("It is a letter!");
		else System.out.println("Not a letter!");
	}
}