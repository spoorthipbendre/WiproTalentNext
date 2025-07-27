import java.util.Scanner;

public class VowelConsonant {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x character:");
		char x = sc.next().charAt(0);
		switch(x) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.print(x+" is vowel.");
			break;
		default : 
			System.out.print(x+"is consonant.");
		}
		sc.close();
	}

}

