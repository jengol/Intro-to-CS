public class Compress{
	public static void main(String[] args){
		String a = "qwwwwwwwwweeeerr  tyyyy";
		String x = Compress(a);
		System.out.println(x);
	}
	public static String Compress(String a) {
		if (a.length() <= 1) {
			return a;
		}
		int x = 1;
		while (x < a.length() && a.charAt(0) == a.charAt(x)) {
			x++;
		}
		String length;
		if (x > 1){
			length = String.valueOf(x);
		} else {
			length = "";
		}
		return length + a.substring(0,1) + Compress(a.substring(x));
	}
}