import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		System.out.print("Enter b value:");
		int b = sc.nextInt();
		System.out.println("AND result:"+ (a&b));
		System.out.println("OR result:"+ (a|b));
		System.out.println("XOR result:"+ (a^b));
		System.out.println("Left shift a<<1 result:"+ (a<<1));
		System.out.println("Right Shift a>>1 result:"+ (a>>1));
		sc.close();
	}

}
