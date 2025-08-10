package ConditionalStatement;

public class AlphabeticalOrder {
	public static void main(String args[]) {
		char ch1 = 'z';
		char ch2 = 'a';
		if(ch1<ch2) {
			System.out.print(ch1+" "+ch2);
		}else {
			System.out.print(ch2+" "+ch1);
		}
	}
}
