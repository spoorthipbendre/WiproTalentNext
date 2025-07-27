import java.util.Scanner;

public class MultiplyByTwoWithoutMulOperator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		int mul = a<<1;
		System.out.println(a+"* 2 ="+mul);
		sc.close();
		
	}

}
