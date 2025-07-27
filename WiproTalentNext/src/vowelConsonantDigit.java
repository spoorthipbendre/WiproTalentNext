import java.util.Scanner;

public class vowelConsonantDigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x character:");
		char x = sc.next().charAt(0);
		if(x=='a'|| x=='e'||x=='i'||x=='o'||x=='u') {
			System.out.print(x+"is vowel.");
		}else if(Character.isDigit(x)) {
			System.out.print(x+"is Digit.");
		}else {
			System.out.print(x+"is Consonant");
		}
		sc.close();
	}

}
