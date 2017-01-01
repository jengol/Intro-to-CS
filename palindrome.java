public class palindrome {
	public static boolean isPalindrome(String s) {

		int len = s.length();
		if (len <= 1){
		IO.reportBadInput();
		System.exit(0);
		}
		
		s = s.toLowerCase();
		
		for (int i = 0; i < len / 2; i++) {

			
			if (s.charAt(i) != s.charAt((len - 1) - i)) {

				return false;

			}

		}

		return true;

	}
	
	public static void main (String[] args){
		
		System.out.println("Enter a string:");
		String s = IO.readString();
		
		if(isPalindrome(s)){
			System.out.println(s + " is a palindrome.");
		}else{
			System.out.println(s + " is not a palindrome.");
			
		}
		
		
	}
}