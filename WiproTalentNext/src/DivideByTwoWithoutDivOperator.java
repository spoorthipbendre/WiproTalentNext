import java.util.Scanner;

public class DivideByTwoWithoutDivOperator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = sc.nextInt();
		int div = a>>1;
		System.out.println(a+"/2="+div);
		sc.close();
	}

}
