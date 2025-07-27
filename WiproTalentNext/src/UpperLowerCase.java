import java.util.Scanner;

public class UpperLowerCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character:");
		char x = sc.next().charAt(0);
		if(Character.isUpperCase(x)) {
			char upper = Character.toLowerCase(x);
			System.out.print(upper);
		}else {
			char lower = Character.toUpperCase(x);
			System.out.print(lower);
		}
		sc.close();
	}

}
