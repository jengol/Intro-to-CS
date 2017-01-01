public class PigLatin{
	public static void main(String[] args){
		System.out.println("Enter a word to be translated into Pig Latin.");
		String a = IO.readString();
		String b = PLatin(a);
		IO.outputStringAnswer(b);
		
	}
	
	public static String PLatin(String a){
		if (a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i' || a.charAt(0) == 'o' || a.charAt(0) == 'u'){
			a += "way";
		} else {
			a = a.substring(1)+a.charAt(0)+"ay";
		}
		return a;
	}
}
			