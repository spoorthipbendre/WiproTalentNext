import java.util.Scanner;

public class OnesCompliment {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = sc.nextInt();
		System.out.println("One's Compliment:"+(~a));
		sc.close();
	}

}
