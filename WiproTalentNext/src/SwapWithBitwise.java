import java.util.Scanner;

public class SwapWithBitwise {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		System.out.print("Enter b value:");
		int b = sc.nextInt();
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After swaping: a="+a+"b="+b);
		sc.close();
	}

}
