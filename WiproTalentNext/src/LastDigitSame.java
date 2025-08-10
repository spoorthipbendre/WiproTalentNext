package ConditionalStatement;

public class LastDigitSame {
	public static void main(String args[]) {
		int a = 6;
		int b = 17;
		if(a > 0 && b > 0) {
			int res1 = a%10;
			int res2 = b%10;
			if(res1 == res2) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}
	}

}
