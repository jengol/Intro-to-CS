public class Poly{
	public static void main(String[] args){
		int a, b, c;
		System.out.println("Enter first root: ");
		a = IO.readInt();
		System.out.println("Enter second root: ");
		b = IO.readInt();
		System.out.println("Enter third root: ");
		c = IO.readInt();
		System.out.println("The polynomial is: ");
		System.out.println("x^3 + " + (-(a + b + c)) + "x^2 + " + (a * b + c * a + c * b) + "x + " + (-(c * a * b)));
	}
}