public class LongestString{
	public static String LString(String[] words){
		
		
		if (words[0].length()>words[1].length() && words[0].length()>words[2].length()){
			return words[0];
		} else if (words[1].length()>words[0].length() && words[1].length()>words[2].length()){
			return words[1];
		} else {
			return words[2];
		}
	}
	public static void main(String[] args){
		
		String[] words = {"hello","goodbye","how?"};
		
		String longestword = LString(words);
		
		System.out.println(longestword);
	}
}
		