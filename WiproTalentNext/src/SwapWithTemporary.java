import java.util.Scanner;

public class SwapWithTemporary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		System.out.print("Enter b value:");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swaping: a=" +a+"b:"+b);
		sc.close();
	}

}
