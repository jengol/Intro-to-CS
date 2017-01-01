/* This program demonstrates what happend when a subroutine changes
 * the value of one of its parameters - does that change stay after
 * the subroutine returns or not?  It depends on whether you change
 * the parameter itself or one of its parts.
 */
public class ChangeParamsA{
    public static void main(String[ ] args){
        int [ ] a = new int [4];  
	a[1] = 5;
	chgInt(a[1]);
	System.out.println("a[1] after chgInt(a[1])" + a[1]);

	a[0] = 5;
	chgPart(a);
	System.out.println("a[1] after chgPart(a) " + a[1]);
	
	a[1] = 5;
	chgA(a);
	System.out.println("a[l] after chgA(a)" + a[1]);
    }  
    public static void chgInt(int p){
	p++; 			//  increment p itself
	System.out.println("p at end of chgInt " + p);
    }
    public static void chgPart(int [ ] b){
	b[1]++;
	System.out.println("b[1] at end of chgPart " + b[1]);
    }
    public static void chgA(int [ ] a){
	a = new int [4];
	a[1] = 99;
	System.out.println("a[1] at end of chgA " + a[1]);
    }

}