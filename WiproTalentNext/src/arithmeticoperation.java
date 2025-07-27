import java.util.Scanner;

public class arithmeticoperation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = sc.nextInt();
		System.out.print("Enter b number:");
		int b = sc.nextInt();
		System.out.println("Adiition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(a/b));
		System.out.println("Modulus:"+(a%b));
		sc.close();
	}

}
