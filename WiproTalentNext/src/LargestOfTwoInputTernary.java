import java.util.Scanner;

public class LargestOfTwoInputTernary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		System.out.print("Enter b value:");
		int b = sc.nextInt();
		int max = (a>b)?a:b;
		System.out.println("Largest:"+max);
		sc.close();
	}

}
