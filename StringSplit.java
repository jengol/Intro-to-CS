public class StringSplit{
	public static void main(String[] args){
		String a = "Hello, my name is John. How are you?";
		String[] b = a.split(" ");
		for (int i = 0; i<b.length; i++){
			System.out.println(b[i]);
		}
	}
}