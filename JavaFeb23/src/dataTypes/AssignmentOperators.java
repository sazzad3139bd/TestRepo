package dataTypes;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		/**Assignment operators are (=, +, -, *, /= and %=)
		 * a = 7 meaning a = 7
		 * a+=7 means a = a+7
		 * a-=7 means a = a-7
		 * a*=7 means a = a*7
		 * 
		 */

		int a = 87;
		System.out.println(a+=7);
		System.out.println(a-=7);//80
		System.out.println(a*=7);//609
		System.out.println(a/=7);
		System.out.println(a%=7);
		
	}

}
