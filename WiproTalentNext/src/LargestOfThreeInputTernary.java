import java.util.Scanner;

public class LargestOfThreeInputTernary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		System.out.print("Enter b value:");
		int b = sc.nextInt();
		System.out.print("Enter c value:");
		int c = sc.nextInt();
		int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Largest:"+max);
		sc.close();
	}

}
