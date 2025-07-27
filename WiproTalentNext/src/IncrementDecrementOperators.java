import java.util.Scanner;

public class IncrementDecrementOperators {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x value:");
		int x = sc.nextInt();
		System.out.println("Original:"+x);
		System.out.println("Post-Increment:"+(x++));
		System.out.println("After post-Increment:"+x);
		System.out.println("Pre- Increment:"+(++x));
		System.out.println("Post-Decrement:"+(x--));
		System.out.println("After post-Decrement:"+x);
		System.out.println("Pre-Decrement:"+(--x));
		sc.close();
	}

}
