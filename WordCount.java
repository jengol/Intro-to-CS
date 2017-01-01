public class WordCount{
	public static void main(String[] args){
		String a = IO.readString(); // My name is John.
		String[] words = a.split(" ");
		int b = IO.readInt();
		int x = Count(words,b);
		IO.outputIntAnswer(x);
	}
	
	public static int Count(String[] words, int b){
		int c = 0;
		int count = 0;
		for (int i=0; i<words.length; i++){
			for (int j = 0; j<words[i].length(); j++){
				
				if (Character.isLetter(words[i].charAt(j)) == true){
					c++;
				}
			}
			if (c>=b){
				count++;
			}
			c = 0;
		}
			return count;
	}
}