public class StringRec{
	public static void main (String[] args){
		String s = IO.readString();
		System.out.println(decompress(s));
	}
	
	public static String decompress(String s){
		
		if(s.equals("") || s.length()== 1){
			return s;
		}
		
		String a = "";
		String b = "";
		char c = s.charAt(0);
		
		if(Character.isLetter(c) == true){
			a = s.substring(0,1);
			b = s.substring(1);
			return a + decompress(b);
			
		} else {
			a = s.substring(0,2);
			b = s.substring(2);
			int x = Integer.parseInt(s.substring(0,1));
			char y = s.charAt(1);
			return simpleDecompress(x, y) + decompress(b); 
		}
	}
		
	public static String simpleDecompress(int x, char y){
		if (x < 1){
			return "";
		} else {
			return y + simpleDecompress(x-1, y);
		}
	}
}