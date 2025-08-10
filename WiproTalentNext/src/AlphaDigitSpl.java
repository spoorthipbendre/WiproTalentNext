package ConditionalStatement;

public class AlphaDigitSpl {
	public static void main(String args[]) {
		char x = '#';
		if(Character.isAlphabetic(x)) {
			System.out.print("Alphabet");
		}else if(Character.isDigit(x)) {
			System.out.print("Digit");
		}else {
			System.out.print("Special Character");
		}
	}
}
